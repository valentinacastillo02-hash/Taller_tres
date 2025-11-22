package Dominio;
//Media Prioridad


import Patrones.PatronVisitorTarea;

public class Feature extends Tarea {

	public Feature(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, String fechaTarea) {
		super(iD_proyecto, idTarea, tipoTarea, descripcionTarea, estadoTarea, responsableTarea, complejidadTarea, fechaTarea);
		// TODO Auto-generated constructor stub
	}
	public void aceptado(PatronVisitorTarea visitor) {
		// TODO Auto-generated method stub
		visitor.visitarFeature(this);
		
	}

	@Override
	public int gaetImpacto() {
		// TODO Auto-generated method stub
		return 2;
	}

}
