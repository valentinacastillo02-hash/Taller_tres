//Emiliano Angel Toro Rojas, RUT: 21.512.702-8, Carrera: Ingenieria en tecnologias de información.
//Valentina Castillo,Rut; 15.166.692-2, Carrera: Ingenieria en tecnologias de información.




package Dominio;

public class Usuario_generico {
	private String Username;
	private String Contraseña;
	private String Rol;
	
	public Usuario_generico(String Username,String Contraseña,String Rol) {
		this.setUsername(Username);
		this.setContraseña(Contraseña);
		this.setRol(Rol);
		
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}
	public boolean  esAdministrador() {return Rol.equals("Administrador");}

}
