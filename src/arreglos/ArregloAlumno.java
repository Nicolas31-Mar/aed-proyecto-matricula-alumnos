
package arreglos;

import java.util.ArrayList;
import clases.Alumno;

public class ArregloAlumno {
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public ArregloAlumno() {
		adicionar(new Alumno(1001, 15, 987654321, 0, "Carlos Alberto", "Pérez López", "75432168"));
		adicionar(new Alumno(1002, 16, 965432187, 1, "María Fernanda", "Torres Díaz", "72845619"));
	}

	public boolean adicionar(Alumno alumno) {
		if(buscar(alumno.getCodAlumno()) != null) {
			return false;
		}

		alumnos.add(alumno);
		return true;
	}

	public int tamanio() {
		return alumnos.size();
	}

	public Alumno obtener(int posicion) {
		return alumnos.get(posicion);
	}

	public Alumno buscar(int codAlumno) {
		for(int i = 0; i < tamanio(); i++) {
			Alumno alumno = obtener(i);
			if(alumno.getCodAlumno() == codAlumno) {
				return alumno;
			}
		}
		return null;
	}

	public boolean eliminar(int codAlumno) {
		Alumno alumno = buscar(codAlumno);
		if(alumno == null) {
			return false;
		}

		alumnos.remove(alumno);
		return true;
	}

	public boolean modificar(Alumno datos) {
		Alumno actual = buscar(datos.getCodAlumno());

		if(actual == null) {
			return false;
		}

		actual.setEdad(datos.getEdad());
		actual.setCelular(datos.getCelular());
		actual.setEstado(datos.getEstado());
		actual.setNombres(datos.getNombres());
		actual.setApellidos(datos.getApellidos());
		actual.setDni(datos.getDni());
		return true;
	}

}
