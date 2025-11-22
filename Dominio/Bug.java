package Dominio;
//Alta Prioridad


import Patrones.PatronVisitorTarea;

public class Bug extends Tarea{

	public Bug(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, String fechaTarea) {
		super(iD_proyecto, idTarea, tipoTarea, descripcionTarea, estadoTarea, responsableTarea, complejidadTarea,
				fechaTarea);
	}
	@Override
	public void aceptado(PatronVisitorTarea visitor) {
		// TODO Auto-generated method stub
		visitor.visitarBug(this);
		
	}

	@Override
	public int gaetImpacto() {
		// TODO Auto-generated method stub
		return 3;
	}



}
