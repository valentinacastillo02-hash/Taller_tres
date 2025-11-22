 //Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.
package Patrones;



import Dominio.Bug;
import Dominio.Documetacion;
import Dominio.Feature;
import Dominio.Tarea;


public class FactoryTareas {
	public static Tarea crearTarea(String proyectoId, String id, String tipo, 
            String descripcion, String estado, String responsable, 
            String complejidad, String fecha) {
if (tipo.equals("Bug")) {
	return new Bug(proyectoId, id, descripcion, estado, responsable, complejidad, fecha, tipo);
} else if (tipo.equals("Feature")) {
	return new Feature(proyectoId, id, descripcion, estado, responsable, complejidad, fecha, tipo);
} else if (tipo.equals("Documentacion")) {
	return new Documetacion(proyectoId, id, descripcion, estado, responsable, complejidad, fecha, tipo);
}
return null;
	

	}
}