package Dominio;

import java.util.ArrayList;

public class proyecto {
	private String IDProyecto;
	private String NombreProyecto;
	private String ResponsableProyecto;
	private ArrayList<Tarea> tarea;
	
	public proyecto(String IDProyecto,String NombreProyecto,String ResponsableProyecto) {
		this.IDProyecto=IDProyecto;
		this.NombreProyecto=NombreProyecto;
		this.ResponsableProyecto=ResponsableProyecto;
		this.tarea=new ArrayList<>();
	}

	public String getIDProyecto() {
		return IDProyecto;
	}

	public void setIDProyecto(String iDProyecto) {
		IDProyecto = iDProyecto;
	}

	public String getNombreProyecto() {
		return NombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		NombreProyecto = nombreProyecto;
	}

	public String getResponsableProyecto() {
		return ResponsableProyecto;
	}

	public void setResponsableProyecto(String responsableProyecto) {
		ResponsableProyecto = responsableProyecto;
	}
	
	public ArrayList<Tarea> gettarea(){
		return tarea;
	}
	public void AgregarTarea(Tarea t) {
		tarea.add(t);
	}
	public void EliminarTarea(String idTarea) {
		for(int a=0;a<tarea.size();a++){
			if (tarea.get(a).getID_proyecto().equals(idTarea)) {
				tarea.remove(a);
				break;
				
			}
		}
	

}

	

}
