package arreglos;

import java.util.ArrayList;
import clases.Matricula;

public class ArregloMatricula {
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public Matricula buscar(int numMatricula) {
	    for (int i = 0; i < matriculas.size(); i++) {
	        Matricula matricula = matriculas.get(i);

	        if (matricula.getNumMatricula() == numMatricula) {
	            return matricula;
	        }
	    }
	    return null;
	}
	
	public boolean adicionar(Matricula matricula) {
		if (buscar(matricula.getNumMatricula()) != null) {
			return false;
		}
		matriculas.add(matricula);
		return true;
	}
	
	public int tamanio() {
		return matriculas.size();
	}
	
	public Matricula obtener(int posicion) {
		return matriculas.get(posicion);
	}
	
	public boolean eliminar(int numMatricula) {
		Matricula matricula = buscar(numMatricula);	
		
		if(matricula == null) {
			return false;
		}
		matriculas.remove(matricula);
		return true;
	}
	
	public boolean modificar(Matricula datos) {
		Matricula actual = buscar(datos.getNumMatricula());
		
		if(actual == null) {
			return false;
		}
		actual.setCodAlumno(datos.getCodAlumno());
	    actual.setCodSeccion(datos.getCodSeccion());
	    actual.setFecha(datos.getFecha());
	    actual.setHora(datos.getHora());
	    return true;
	}
}