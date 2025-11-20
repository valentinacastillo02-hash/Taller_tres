package Dominio;
//Alta Prioridad
import java.time.LocalDate;

public class Bug extends Tarea{

	public Bug(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, LocalDate fechaTarea) {
		super(iD_proyecto, idTarea, tipoTarea, descripcionTarea, estadoTarea, responsableTarea, complejidadTarea,
				fechaTarea);
	}



}
