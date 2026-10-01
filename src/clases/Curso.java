package clases;

public class Curso {
	
	private int codCurso, grado, nivel, horas;
	private String asignatura;
	
	
	public Curso(int codCurso, int grado, int nivel, int horas, String asignatura) {
		this.codCurso = codCurso;
		this.grado = grado;
		this.nivel = nivel;
		this.horas = horas;
		this.asignatura = asignatura;
	}


	public int getCodCurso() {
		return codCurso;
	}


	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}


	public int getGrado() {
		return grado;
	}


	public void setGrado(int grado) {
		this.grado = grado;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
}
