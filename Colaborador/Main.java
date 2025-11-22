//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.

package Colaborador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	 private static Sistema sistema;
	    private static Usuario usuarioActual;

	    public static void main(String[] args) {
	        sistema = Sistema.getInstance();
	        sistema.cargarDatos();
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\n=== SISTEMA DE GESTIÓN DE PROYECTOS ===");
	            System.out.println("1. Iniciar sesión");
	            System.out.println("2. Salir");
	            System.out.print("Seleccione una opción: ");
	            
	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar buffer
	            
	            switch (opcion) {
	                case 1:
	                    iniciarSesion(scanner);
	                    break;
	                case 2:
	                    sistema.guardarDatos();
	                    System.out.println("¡Hasta luego!");
	                    return;
	                default:
	                    System.out.println("Opción inválida");
	            }
	        }
	    }
	    
	    private static void iniciarSesion(Scanner scanner) {
	        System.out.print("Usuario: ");
	        String username = scanner.nextLine();
	        System.out.print("Contraseña: ");
	        String password = scanner.nextLine();
	        
	        usuarioActual = sistema.autenticarUsuario(username, password);
	        
	        if (usuarioActual != null) {
	            System.out.println("¡Bienvenido " + usuarioActual.getUsername() + "!");
	            if (usuarioActual.getRol().equals("Administrador")) {
	                mostrarMenuAdministrador(scanner);
	            } else {
	                mostrarMenuColaborador(scanner);
	            }
	        } else {
	            System.out.println("Credenciales incorrectas");
	        }
	    }
	    
	    private static void mostrarMenuAdministrador(Scanner scanner) {
	        while (true) {
	            System.out.println("\n=== MENÚ ADMINISTRADOR ===");
	            System.out.println("1. Ver lista completa de proyectos y tareas");
	            System.out.println("2. Agregar proyecto");
	            System.out.println("3. Eliminar proyecto");
	            System.out.println("4. Agregar tarea");
	            System.out.println("5. Eliminar tarea");
	            System.out.println("6. Asignar prioridades (Strategy)");
	            System.out.println("7. Generar reporte de proyectos");
	            System.out.println("8. Cerrar sesion");
	            System.out.print("Seleccione una opción: ");
	            
	            int opcion = scanner.nextInt();
	            scanner.nextLine();
	            
	            switch (opcion) {
	                case 1: sistema.mostrarProyectosYTareas(); break;
	                case 2: sistema.agregarProyecto(scanner); break;
	                case 3: sistema.eliminarProyecto(scanner); break;
	                case 4: sistema.agregarTarea(scanner); break;
	                case 5: sistema.eliminarTarea(scanner); break;
	                case 6: sistema.asignarPrioridades(scanner); break;
	                case 7: sistema.generarReporte(); break;
	                case 8: return;
	                default: System.out.println("Opción invalida");
	            }
	        }
	    }
	    
	    private static void mostrarMenuColaborador(Scanner scanner) {
	        while (true) {
	            System.out.println("\n=== MENÚ COLABORADOR ===");
	            System.out.println("1. Ver proyectos disponibles");
	            System.out.println("2. Ver mis tareas asignadas");
	            System.out.println("3. Actualizar estado de tarea");
	            System.out.println("4. Aplicar Visitor sobre tareas");
	            System.out.println("5. Cerrar sesion");
	            System.out.print("Seleccione una opción: ");
	            
	            int opcion = scanner.nextInt();
	            scanner.nextLine();
	            
	            switch (opcion) {
	                case 1: sistema.mostrarProyectosDisponibles(); break;
	                case 2: sistema.mostrarTareasAsignadas(usuarioActual.getUsername()); break;
	                case 3: sistema.actualizarEstadoTarea(scanner, usuarioActual.getUsername()); break;
	                case 4: sistema.aplicarVisitorTareas(usuarioActual.getUsername()); break;
	                case 5: return;
	                default: System.out.println("Opción inválida");
	            }
	        }
	    }
	}

	
}
	


