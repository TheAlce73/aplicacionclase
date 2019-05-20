package Conexion;

public class Usuarios {
	Integer Cod_Usuario;
	String NombreUser;
	String Contraseña;
	String Admin;
	
	public Usuarios(Integer cod_Usuario, String nombreUser, String contraseña, String admin) {
		super();
		Cod_Usuario = cod_Usuario;
		NombreUser = nombreUser;
		Contraseña = contraseña;
		Admin = admin;
	}

	public Integer getCod_Usuario() {
		return Cod_Usuario;
	}

	public void setCod_Usuario(Integer co_Usuario) {
		Cod_Usuario = co_Usuario;
	}

	public String getNombreUser() {
		return NombreUser;
	}

	public void setNombreUser(String nombreUser) {
		NombreUser = nombreUser;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getAdmin() {
		return Admin;
	}

	public void setAdmin(String admin) {
		Admin = admin;
	}
	
	

}
