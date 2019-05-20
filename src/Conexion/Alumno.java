package Conexion;

import oracle.sql.DATE;

public class Alumno {
	
	Integer Cod_Alumno;
	String NombreA;
	String Apellidos;
	String Direccion;
	DATE Fecha_Nacimiento;
	
	
	public Alumno(Integer cod_Alumno, String nombreA, String apellidos, String direccion, DATE fecha_Nacimiento) {
		super();
		Cod_Alumno = cod_Alumno;
		NombreA = nombreA;
		Apellidos = apellidos;
		Direccion = direccion;
		Fecha_Nacimiento = fecha_Nacimiento;
	}


	public Integer getCod_Alumno() {
		return Cod_Alumno;
	}


	public void setCod_Alumno(Integer cod_Alumno) {
		Cod_Alumno = cod_Alumno;
	}


	public String getNombreA() {
		return NombreA;
	}


	public void setNombreA(String nombreA) {
		NombreA = nombreA;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public DATE getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}


	public void setFecha_Nacimiento(DATE fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}
	
	

}
