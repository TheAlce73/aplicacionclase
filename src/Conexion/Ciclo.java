package Conexion;

public class Ciclo {
	
	Integer Cod_Ciclo;
	String Tipo;
	String NombreC;
	String ProgramaFormativo;
	//FK
	Integer ClaveFP;
	
	
	public Ciclo(Integer cod_Ciclo, String tipo, String nombreC, String programaFormativo, Integer claveFP) {
		super();
		Cod_Ciclo = cod_Ciclo;
		Tipo = tipo;
		NombreC = nombreC;
		ProgramaFormativo = programaFormativo;
		ClaveFP = claveFP;
	}


	public Integer getCod_Ciclo() {
		return Cod_Ciclo;
	}


	public void setCod_Ciclo(Integer cod_Ciclo) {
		Cod_Ciclo = cod_Ciclo;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public String getNombreC() {
		return NombreC;
	}


	public void setNombreC(String nombreC) {
		NombreC = nombreC;
	}


	public String getProgramaFormativo() {
		return ProgramaFormativo;
	}


	public void setProgramaFormativo(String programaFormativo) {
		ProgramaFormativo = programaFormativo;
	}


	public Integer getClaveFP() {
		return ClaveFP;
	}


	public void setClaveFP(Integer claveFP) {
		ClaveFP = claveFP;
	}
	
	

}
