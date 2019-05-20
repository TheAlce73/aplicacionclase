package Conexion;

public class FamiliaProfesional {
	
	Integer ClaveFP;
	String NombreFP;
	
	
	public FamiliaProfesional(Integer claveFP, String nombreFP) {
		super();
		ClaveFP = claveFP;
		NombreFP = nombreFP;
	}


	public Integer getClaveFP() {
		return ClaveFP;
	}


	public void setClaveFP(Integer claveFP) {
		ClaveFP = claveFP;
	}


	public String getNombreFP() {
		return NombreFP;
	}


	public void setNombreFP(String nombreFP) {
		NombreFP = nombreFP;
	}
	
	

}
