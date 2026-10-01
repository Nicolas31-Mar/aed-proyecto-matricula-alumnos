package clases;

public class Docente {

	private int codDocente, celular;
	private String nombres, apellidos, dni, especialidad;

	public Docente(int codDocente, String nombres, String apellidos, String dni, int celular, String especialidad) {
		this.codDocente = codDocente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.celular = celular;
		this.especialidad = especialidad;
	}

	public int getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
