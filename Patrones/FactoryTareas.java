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