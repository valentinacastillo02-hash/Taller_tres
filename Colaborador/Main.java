package Colaborador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.Tarea;
import Dominio.Usuario_generico;
import Dominio.proyecto;
import Dominio.usuario_colab;
import Patrones.FactoryTareas;

public class Main {
		    private static Main instancia = null;
		    private ArrayList<Usuario_generico> usuarios;
		    private ArrayList<proyecto> proyectos;
		    private Usuario_generico usuarioActual;
		    
		 
		    private Main() {
		        usuarios = new ArrayList<Usuario_generico>();
		        proyectos = new ArrayList<proyecto>();
		        usuarioActual = null;
		    }
		    
		    
		    public static Main obtenerInstancia() {
		        if (instancia == null) {
		            instancia = new Main();
		        }
		        return instancia;
		    }
		    
		   
		    
		    public void cargarDatos() {
		        cargarUsuarios();
		        cargarProyectos();
		        cargarTareas();
		    }
		    
		    private void cargarUsuarios() {
		        try {
		            File archivo = new File("usuarios.txt");
		            Scanner scanner = new Scanner(archivo);
		            
		            while (scanner.hasNextLine()) {
		                String linea = scanner.nextLine();
		                String[] partes = linea.split("\\|");
		                if (partes.length == 3) {
		                    Usuario_generico u = new Usuario_generico(partes[0], partes[1], partes[2]);
		                    usuarios.add(u);
		                }
		            }
		            scanner.close();
		            System.out.println("[SISTEMA] " + usuarios.size() + " usuarios cargados");
		        } catch (FileNotFoundException e) {
		            System.out.println("[ERROR] Archivo usuarios.txt no encontrado");
		        }
		    }
		    
		    private void cargarProyectos() {
		        try {
		            File archivo = new File("proyectos.txt");
		            Scanner scanner = new Scanner(archivo);
		            
		            while (scanner.hasNextLine()) {
		                String linea = scanner.nextLine();
		                String[] partes = linea.split("\\|");
		                if (partes.length == 3) {
		                    proyecto p = new proyecto(partes[0], partes[1], partes[2]);
		                    proyectos.add(p);
		                }
		            }
		            scanner.close();
		            System.out.println("[SISTEMA] " + proyectos.size() + " proyectos cargados");
		        } catch (FileNotFoundException e) {
		            System.out.println("[ERROR] Archivo proyectos.txt no encontrado");
		        }
		    }
		    
		    private void cargarTareas() {
		        try {
		            File archivo = new File("tareas.txt");
		            Scanner scanner = new Scanner(archivo);
		            int tareasCargadas = 0;
		            
		            while (scanner.hasNextLine()) {
		                String linea = scanner.nextLine();
		                String[] partes = linea.split("\\|");
		                if (partes.length == 8) {
		                    // Usar Factory para crear la tarea según tipo
		                    Tarea t = Patrones.FactoryTareas.crearTarea(
		                        partes[0], // proyectoId
		                        partes[1], // id
		                        partes[2], // tipo
		                        partes[3], // descripcion
		                        partes[4], // estado
		                        partes[5], // responsable
		                        partes[6], // complejidad
		                        partes[7]  // fecha
		                    );
		                    
		                    if (t != null) {
		                       
		                        for (proyecto p : proyectos) {
		                            if (p.getIDProyecto().equals(partes[0])) {
		                                p.AgregarTarea(t);
		                                tareasCargadas++;
		                                break;
		                            }
		                        }
		                    }
		                }
		            }
		            scanner.close();
		            System.out.println("[SISTEMA] " + tareasCargadas + " tareas cargadas");
		        } catch (FileNotFoundException e) {
		            System.out.println("[ERROR] Archivo tareas.txt no encontrado");
		        }
		    }
		    
		  
		    
		    public boolean login(String username, String password) {
		        for (Usuario_generico u : usuarios) {
		            if (u.getUsername().equals(username) && u.getContraseña().equals(password)) {
		                usuarioActual = u;
		                return true;
		            }
		        }
		        return false;
		    }
		    
		    public Usuario_generico getUsuarioActual() {
		        return usuarioActual;
		    }
		    
		    public void logout() {
		        usuarioActual = null;
		    }
		    
		   
		    
		    public ArrayList<proyecto> getProyectos() {
		        return proyectos;
		    }
		    
		    public proyecto buscarProyecto(String id) {
		        for (proyecto p : proyectos) {
		            if (p.getIDProyecto().equals(id)) {
		                return p;
		            }
		        }
		        return null;
		    }
		    
		    public void agregarProyecto(String id, String nombre, String responsable) {
		        proyecto p = new proyecto(id, nombre, responsable);
		        proyectos.add(p);
		        System.out.println("[OK] Proyecto agregado: " + nombre);
		    }
		    
		    public void eliminarProyecto(String id) {
		        for (int i = 0; i < proyectos.size(); i++) {
		            if (proyectos.get(i).getIDProyecto().equals(id)) {
		                System.out.println("[OK] Proyecto eliminado: " + proyectos.get(i).getNombreProyecto());
		                proyectos.remove(i);
		                return;
		            }
		        }
		        System.out.println("[ERROR] Proyecto no encontrado");
		    }
		    
		   
		    
		    public void agregarTarea(String proyectoId, String id, String tipo, String descripcion,
		                            String responsable, String complejidad, String fecha) {
		     
		        if (!validarDisponibilidad(responsable, fecha)) {
		            System.out.println("[ERROR] " + responsable + " ya tiene tarea asignada el " + fecha);
		            return;
		        }
		        
		        proyecto p = buscarProyecto(proyectoId);
		        if (p != null) {
		         
		            Tarea t = FactoryTareas.crearTarea(proyectoId, id, tipo, descripcion, 
		                                               "Pendiente", responsable, complejidad, fecha);
		            if (t != null) {
		                p.AgregarTarea(t);
		                System.out.println("[OK] Tarea agregada: " + descripcion);
		            }
		        } else {
		            System.out.println("[ERROR] Proyecto no encontrado");
		        }
		    }
		    
		    private boolean validarDisponibilidad(String responsable, String fecha) {
		        for (proyecto p : proyectos) {
		            for (Tarea t : p.gettarea()) {
		                if (t.getResponsableTarea().equals(responsable) && t.getFechaTarea().equals(fecha)) {
		                    return false;
		                }
		            }
		        }
		        return true;
		    }
		    
		    public void eliminarTarea(String proyectoId, String tareaId) {
		        proyecto p = buscarProyecto(proyectoId);
		        if (p != null) {
		            p.EliminarTarea(tareaId);
		            System.out.println("[OK] Tarea eliminada");
		        } else {
		            System.out.println("[ERROR] Proyecto no encontrado");
		        }
		    }

	}
