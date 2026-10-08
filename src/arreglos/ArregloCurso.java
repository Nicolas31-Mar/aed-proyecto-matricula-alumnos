
package arreglos;

import java.util.ArrayList;
import clases.Curso;

public class ArregloCurso {
	private ArrayList<Curso> cursos = new ArrayList<Curso>();

	public ArregloCurso() {
		adicionar(new Curso(1, 1, 0, 4, "Matemática"));
		adicionar(new Curso(2, 2, 0, 3, "Comunicación"));
	}

	public boolean adicionar(Curso curso) {
		if(buscar(curso.getCodCurso()) != null) {
			return false;
		}

		cursos.add(curso);
		return true;
	}

	public int tamanio() {
		return cursos.size();
	}

	public Curso obtener(int posicion) {
		return cursos.get(posicion);
	}

	public Curso buscar(int codCurso) {
		for(int i = 0; i < tamanio(); i++) {
			Curso curso = obtener(i);
			if(curso.getCodCurso() == codCurso) {
				return curso;
			}
		}
		return null;
	}

	public boolean eliminar(int codCurso) {
		Curso curso = buscar(codCurso);
		if(curso == null) {
			return false;
		}

		cursos.remove(curso);
		return true;
	}

	public boolean modificar(Curso datos) {
		Curso actual = buscar(datos.getCodCurso());

		if(actual == null) {
			return false;
		}

		actual.setGrado(datos.getGrado());
		actual.setNivel(datos.getNivel());
		actual.setHoras(datos.getHoras());
		actual.setAsignatura(datos.getAsignatura());
		return true;
	}

}

