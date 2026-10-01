package clases;

public class Seccion {

	private int codSeccion, codCurso, codDocente;
	private String aula, horario;

	public Seccion(int codSeccion, int codCurso, int codDocente, String aula, String horario) {
		this.codSeccion = codSeccion;
		this.codCurso = codCurso;
		this.codDocente = codDocente;
		this.aula = aula;
		this.horario = horario;
	}

	public int getCodSeccion() {
		return codSeccion;
	}

	public void setCodSeccion(int codSeccion) {
		this.codSeccion = codSeccion;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public int getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}
