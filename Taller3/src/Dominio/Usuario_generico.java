package Dominio;

public class Usuario_generico {
	private String Username;
	private String Contraseña;
	private String Rol;
	
	public Usuario_generico(String Username,String Contraseña,String Rol) {
		this.setUsername(Username);
		this.setContraseña(Contraseña);
		
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

}
