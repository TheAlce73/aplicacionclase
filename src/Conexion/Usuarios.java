package Conexion;

public class Usuarios {
	Integer Cod_Usuario;
	String NombreUser;
	String Contrase�a;
	String Admin;
	
	public Usuarios(Integer cod_Usuario, String nombreUser, String contrase�a, String admin) {
		super();
		Cod_Usuario = cod_Usuario;
		NombreUser = nombreUser;
		Contrase�a = contrase�a;
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

	public String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}

	public String getAdmin() {
		return Admin;
	}

	public void setAdmin(String admin) {
		Admin = admin;
	}
	
	

}
