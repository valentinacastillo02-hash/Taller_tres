package Dominio;
//Baja prioridad
import java.time.LocalDate;

import Patrones.PatronVisitorTarea;

public class Documetacion extends Tarea{

	public Documetacion(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea,
			String estadoTarea, String responsableTarea, String complejidadTarea, LocalDate fechaTarea) {
		super(iD_proyecto, idTarea, tipoTarea, descripcionTarea, estadoTarea, responsableTarea, complejidadTarea, fechaTarea);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void aceptado(PatronVisitorTarea visitor) {
		// TODO Auto-generated method stub
		visitor.visitarDocumentacion(this);
		
	}

	@Override
	public int gaetImpacto() {
		// TODO Auto-generated method stub
		return 1;
	}



}
