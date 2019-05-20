package Conexion;

import oracle.sql.DATE;

public class Empresa {
	
	Integer ID_Convenio;
	DATE FechaFirmaConvenio;
	String CIF;
	Integer FAX;
	String NombreEmpresa;
	Integer NumeroConvenio;
	Integer Telefono;
	String direccion;
	String Ciudad;
	String Provincia;
	Integer CP;
	String Representante;
	String DNIRepresentante;
	String CiudadFirmaConvenio;
	
	public Empresa(Integer iD_Convenio, DATE fechaFirmaConvenio, String cIF, Integer fAX, String nombreEmpresa,
			Integer numeroConvenio, Integer telefono, String direccion, String ciudad, String provincia, Integer cP,
			String representante, String dNIRepresentante, String ciudadFirmaConvenio) {
		super();
		this.ID_Convenio = iD_Convenio;
		this.FechaFirmaConvenio = fechaFirmaConvenio;
		this.CIF = cIF;
		this.FAX = fAX;
		this.NombreEmpresa = nombreEmpresa;
		this.NumeroConvenio = numeroConvenio;
		this.Telefono = telefono;
		this.direccion = direccion;
		this.Ciudad = ciudad;
		this.Provincia = provincia;
		this.CP = cP;
		this.Representante = representante;
		this.DNIRepresentante = dNIRepresentante;
		this.CiudadFirmaConvenio = ciudadFirmaConvenio;
	}

	public Integer getID_Convenio() {
		return ID_Convenio;
	}

	public void setID_Convenio(Integer iD_Convenio) {
		ID_Convenio = iD_Convenio;
	}

	public DATE getFechaFirmaConvenio() {
		return FechaFirmaConvenio;
	}

	public void setFechaFirmaConvenio(DATE fechaFirmaConvenio) {
		FechaFirmaConvenio = fechaFirmaConvenio;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public Integer getFAX() {
		return FAX;
	}

	public void setFAX(Integer fAX) {
		FAX = fAX;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public Integer getNumeroConvenio() {
		return NumeroConvenio;
	}

	public void setNumeroConvenio(Integer numeroConvenio) {
		NumeroConvenio = numeroConvenio;
	}

	public Integer getTelefono() {
		return Telefono;
	}

	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public Integer getCP() {
		return CP;
	}

	public void setCP(Integer cP) {
		CP = cP;
	}

	public String getRepresentante() {
		return Representante;
	}

	public void setRepresentante(String representante) {
		Representante = representante;
	}

	public String getDNIRepresentante() {
		return DNIRepresentante;
	}

	public void setDNIRepresentante(String dNIRepresentante) {
		DNIRepresentante = dNIRepresentante;
	}

	public String getCiudadFirmaConvenio() {
		return CiudadFirmaConvenio;
	}

	public void setCiudadFirmaConvenio(String ciudadFirmaConvenio) {
		CiudadFirmaConvenio = ciudadFirmaConvenio;
	}
	
	
	
	
	
}
