package Conexion;

import oracle.sql.DATE;

public class RealizarPracticas {
	
	Integer CodAlumno;
	Integer IDConvenio;
	DATE FechaInicio;
	DATE FechaFin;
	Integer HorarioDia;
	Integer HorasTotal;
	Integer HorarioTarde;
	Integer HorarioMa�ana;
	
	public RealizarPracticas(Integer codAlumno, Integer iDConvenio, DATE fechaInicio, DATE fechaFin, Integer horarioDia,
			Integer horasTotal, Integer horarioTarde, Integer horarioMa�ana) {
		super();
		CodAlumno = codAlumno;
		IDConvenio = iDConvenio;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		HorarioDia = horarioDia;
		HorasTotal = horasTotal;
		HorarioTarde = horarioTarde;
		HorarioMa�ana = horarioMa�ana;
	}

	public Integer getCodAlumno() {
		return CodAlumno;
	}

	public void setCodAlumno(Integer codAlumno) {
		CodAlumno = codAlumno;
	}

	public Integer getIDConvenio() {
		return IDConvenio;
	}

	public void setIDConvenio(Integer iDConvenio) {
		IDConvenio = iDConvenio;
	}

	public DATE getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(DATE fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public DATE getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(DATE fechaFin) {
		FechaFin = fechaFin;
	}

	public Integer getHorarioDia() {
		return HorarioDia;
	}

	public void setHorarioDia(Integer horarioDia) {
		HorarioDia = horarioDia;
	}

	public Integer getHorasTotal() {
		return HorasTotal;
	}

	public void setHorasTotal(Integer horasTotal) {
		HorasTotal = horasTotal;
	}

	public Integer getHorarioTarde() {
		return HorarioTarde;
	}

	public void setHorarioTarde(Integer horarioTarde) {
		HorarioTarde = horarioTarde;
	}

	public Integer getHorarioMa�ana() {
		return HorarioMa�ana;
	}

	public void setHorarioMa�ana(Integer horarioMa�ana) {
		HorarioMa�ana = horarioMa�ana;
	}
	
	

}
