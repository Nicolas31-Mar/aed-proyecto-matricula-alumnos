package clases;

public class Apoderado {

	private int codApoderado, celular, codAlumno;
	private String nombres, dni, apellidos;

	public Apoderado(int codApoderado, String nombres, String apellidos, String dni, int celular, int codAlumno) {
		this.codApoderado = codApoderado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.celular = celular;
		this.codAlumno = codAlumno;
	}	

	public int getCodApoderado() {
		return codApoderado;
	}

	public void setCodApoderado(int codApoderado) {
		this.codApoderado = codApoderado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}
}
