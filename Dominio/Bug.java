//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.




package Dominio;



import Patrones.PatronVisitorTarea;

//Alta Prioridad


public class Bug extends Tarea{

	public Bug(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, String fechaTarea) {
		super( iD_proyecto,  idTarea,  tipoTarea, descripcionTarea,  estadoTarea,
				 responsableTarea,  complejidadTarea,  fechaTarea);
		// TODO Auto-generated constructor stub
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




