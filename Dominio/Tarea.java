package Dominio;

import java.time.LocalDate;

//Clase Padre
//Para que hereden una clase, la clase padre tiene  que ser abstract
/*El txt se divide de la siguiente manera: 
• Proyecto: Señala el id del proyecto al que pertenece. 
• ID: Identificador único de la tarea. 
• Tipo: Indica el tipo de tarea que es. 
• Descripción: Indica la descripción de la tarea. 
• Estado: Indica el estado actual en el que se encuentra la tarea. 
• Responsable: Indica la persona responsable de la tarea. 
• Complejidad: Indica la complejidad de la tarea. 
• Fecha: Indica la fecha de creación de la tarea. 
*/

public abstract class Tarea {
	protected String ID_proyecto;
	protected String idTarea;
	protected String TipoTarea;
	protected String DescripcionTarea;
	protected String EstadoTarea;
	protected String ResponsableTarea;
	protected String ComplejidadTarea;
	protected LocalDate FechaTarea;
	public Tarea(String iD_proyecto, String idTarea, String tipoTarea, String descripcionTarea, String estadoTarea,
			String responsableTarea, String complejidadTarea, LocalDate fechaTarea) {
		super();
		this.ID_proyecto = iD_proyecto;
		this.idTarea = idTarea;
		this.TipoTarea = tipoTarea;
		this.DescripcionTarea = descripcionTarea;
		this.EstadoTarea = estadoTarea;
		this.ResponsableTarea = responsableTarea;
		this.ComplejidadTarea = complejidadTarea;
		this.FechaTarea = fechaTarea;
	}
	public String getID_proyecto() {
		return ID_proyecto;
	}
	public void setID_proyecto(String iD_proyecto) {
		ID_proyecto = iD_proyecto;
	}
	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public String getTipoTarea() {
		return TipoTarea;
	}
	public void setTipoTarea(String tipoTarea) {
		TipoTarea = tipoTarea;
	}
	public String getDescripcionTarea() {
		//Strategy
		return DescripcionTarea;
	}
	public void setDescripcionTarea(String descripcionTarea) {
		DescripcionTarea = descripcionTarea;
	}
	public String getEstadoTarea() {
		return EstadoTarea;
	}
	public void setEstadoTarea(String estadoTarea) {
		EstadoTarea = estadoTarea;
	}
	public String getResponsableTarea() {
		return ResponsableTarea;
	}
	public void setResponsableTarea(String responsableTarea) {
		ResponsableTarea = responsableTarea;
	}
	public String getComplejidadTarea() {
		//Strategy
		return ComplejidadTarea;
	}
	public void setComplejidadTarea(String complejidadTarea) {
		ComplejidadTarea = complejidadTarea;
	}
	public LocalDate getFechaTarea() {
		//Strategyy
		return FechaTarea;
	}
	public void setFechaTarea(LocalDate fechaTarea) {
		FechaTarea = fechaTarea;
	}
	
	

}
