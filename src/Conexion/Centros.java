package Conexion;

public class Centros {
	
	Integer cod_centro;
	String NombreCentro;
	String DirectorCentro;
	String NifDirector;
	Integer TelefonoCentro;
	String Ciudad;
	String Provincia;
	String Direcion;
	Integer CP;
	Integer FAX;
	String DAT;
	
	
	public Centros(Integer cod_centro, String nombreCentro, String directorCentro, String nifDirector,
			Integer telefonoCentro, String ciudad, String provincia, String direcion, Integer cP, Integer fAX,
			String dAT) {
		super();
		this.cod_centro = cod_centro;
		NombreCentro = nombreCentro;
		DirectorCentro = directorCentro;
		NifDirector = nifDirector;
		TelefonoCentro = telefonoCentro;
		Ciudad = ciudad;
		Provincia = provincia;
		Direcion = direcion;
		CP = cP;
		FAX = fAX;
		DAT = dAT;
	}


	public Integer getCod_centro() {
		return cod_centro;
	}


	public void setCod_centro(Integer cod_centro) {
		this.cod_centro = cod_centro;
	}


	public String getNombreCentro() {
		return NombreCentro;
	}


	public void setNombreCentro(String nombreCentro) {
		NombreCentro = nombreCentro;
	}


	public String getDirectorCentro() {
		return DirectorCentro;
	}


	public void setDirectorCentro(String directorCentro) {
		DirectorCentro = directorCentro;
	}


	public String getNifDirector() {
		return NifDirector;
	}


	public void setNifDirector(String nifDirector) {
		NifDirector = nifDirector;
	}
	
	 public int getTelefonoCentro() {
		 return TelefonoCentro;
	 }
	 
	 public void setTelefonoCentro(Integer telefonoCentro) {
		 TelefonoCentro=telefonoCentro;
	 }


	public String getCiudad() {
		return Ciudad;
	}


	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}


	public String getProvincia() {
		return Provincia;
	}


	public void setProvincia(String provincia) {
		Provincia = provincia;
	}


	public String getDirecion() {
		return Direcion;
	}


	public void setDirecion(String direcion) {
		Direcion = direcion;
	}


	public Integer getCP() {
		return CP;
	}


	public void setCP(Integer cP) {
		CP = cP;
	}


	public Integer getFAX() {
		return FAX;
	}


	public void setFAX(Integer fAX) {
		FAX = fAX;
	}


	public String getDAT() {
		return DAT;
	}


	public void setDAT(String dAT) {
		DAT = dAT;
	}
	
	
	

}
