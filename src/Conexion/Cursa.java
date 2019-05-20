package Conexion;

public class Cursa {
	
	Integer Cod_Alumno;
	Integer Cod_Ciclo;
	Integer Curso;
	
	
	public Cursa(Integer cod_Alumno, Integer cod_Ciclo, Integer curso) {
		super();
		Cod_Alumno = cod_Alumno;
		Cod_Ciclo = cod_Ciclo;
		Curso = curso;
	}


	public Integer getCod_Alumno() {
		return Cod_Alumno;
	}


	public void setCod_Alumno(Integer cod_Alumno) {
		Cod_Alumno = cod_Alumno;
	}


	public Integer getCod_Ciclo() {
		return Cod_Ciclo;
	}


	public void setCod_Ciclo(Integer cod_Ciclo) {
		Cod_Ciclo = cod_Ciclo;
	}


	public Integer getCurso() {
		return Curso;
	}


	public void setCurso(Integer curso) {
		Curso = curso;
	}
	
	

}
