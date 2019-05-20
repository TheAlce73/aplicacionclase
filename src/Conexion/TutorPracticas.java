package Conexion;

public class TutorPracticas {
	
	Integer CodTutorPracticas;
	String NombreTP;
	String ApellidosTP;
	String DNI;
	String email;
	Integer TelefonoTP;
	Integer IDConvenio;
	
	
	public TutorPracticas(Integer codTutorPracticas, String nombreTP, String apellidosTP, String dNI, String email,
			Integer telefonoTP, Integer iDConvenio) {
		super();
		CodTutorPracticas = codTutorPracticas;
		NombreTP = nombreTP;
		ApellidosTP = apellidosTP;
		DNI = dNI;
		this.email = email;
		TelefonoTP = telefonoTP;
		IDConvenio = iDConvenio;
	}


	public Integer getCodTutorPracticas() {
		return CodTutorPracticas;
	}


	public void setCodTutorPracticas(Integer codTutorPracticas) {
		CodTutorPracticas = codTutorPracticas;
	}


	public String getNombreTP() {
		return NombreTP;
	}


	public void setNombreTP(String nombreTP) {
		NombreTP = nombreTP;
	}


	public String getApellidosTP() {
		return ApellidosTP;
	}


	public void setApellidosTP(String apellidosTP) {
		ApellidosTP = apellidosTP;
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


	public Integer getIDConvenio() {
		return IDConvenio;
	}


	public void setIDConvenio(Integer iDConvenio) {
		IDConvenio = iDConvenio;
	}
	
	
	
	

}
