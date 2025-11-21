package Dominio;

public class proyecto {
	private String IDProyecto;
	private String NombreProyecto;
	private String ResponsableProyecto;
	
	public proyecto(String IDProyecto,String NombreProyecto,String ResponsableProyecto) {
		this.IDProyecto=IDProyecto;
		this.NombreProyecto=NombreProyecto;
		this.ResponsableProyecto=ResponsableProyecto;
		
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
	
	

}

	

}
