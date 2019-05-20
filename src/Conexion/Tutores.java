package Conexion;

public class Tutores {
	
	Integer Cod_TutorCiclo;
	String NombreTC;
	String ApellidosTC;
	String DNI;
	String email;
	Integer TelefonoTP;
	Integer Cod_Centro;
	
	public Tutores(Integer cod_TutorCiclo, String nombreTC, String apellidosTC, String dNI, String email,Integer telefonoTP, Integer cod_Centro){
		super();
		this.Cod_TutorCiclo = cod_TutorCiclo;
		this.NombreTC = nombreTC;
		this.ApellidosTC = apellidosTC;
		this.DNI = dNI;
		this.email = email;
		this.TelefonoTP = telefonoTP;
		this.Cod_Centro = cod_Centro;
	}

	public Integer getCod_TutorCiclo() {
		return Cod_TutorCiclo;
	}

	public void setCod_TutorCiclo(Integer cod_TutorCiclo) {
		Cod_TutorCiclo = cod_TutorCiclo;
	}

	public String getNombreTC() {
		return NombreTC;
	}

	public void setNombreTC(String nombreTC) {
		NombreTC = nombreTC;
	}

	public String getApellidosTC() {
		return ApellidosTC;
	}

	public void setApellidosTC(String apellidosTC) {
		ApellidosTC = apellidosTC;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefonoTP() {
		return TelefonoTP;
	}

	public void setTelefonoTP(Integer telefonoTP) {
		TelefonoTP = telefonoTP;
	}

	public Integer getCod_Centro() {
		return Cod_Centro;
	}

	public void setCod_Centro(Integer cod_Centro) {
		Cod_Centro = cod_Centro;
	}
	
	
	
	

}
