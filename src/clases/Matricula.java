package clases;

public class Matricula {
	
	private int numMatricula, codAlumno, codSeccion;
	private String fecha, hora;
	
	public Matricula(int numMatricula, int codAlumno, int codSeccion, String fecha, String hora) {
		this.numMatricula = numMatricula;
		this.codAlumno = codAlumno;
		this.codSeccion = codSeccion;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getCodSeccion() {
		return codSeccion;
	}

	public void setCodSeccion(int codSeccion) {
		this.codSeccion = codSeccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
		
}
