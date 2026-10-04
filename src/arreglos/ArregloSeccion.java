package arreglos;

import java.util.ArrayList;
import clases.Seccion;

public class ArregloSeccion {
	private ArrayList<Seccion> secciones = new ArrayList<Seccion>();
	
	public boolean adicionar(Seccion seccion) {
		if(buscar(seccion.getCodSeccion()) != null) {
			return false;
		}
		
		secciones.add(seccion);
		return true;
	}
	
	public int tamanio() {
		return secciones.size();
	}
	
	public Seccion obtener(int posicion) {
		return secciones.get(posicion);
	}
	
	public Seccion buscar(int codSeccion) {
		for(int i = 0; i < tamanio(); i++) {
			Seccion seccion = obtener(i);
			if(seccion.getCodSeccion() == codSeccion) {
				return seccion;
			}
		}
		return null;
	}
	
	public boolean eliminar(int codSeccion) {
		Seccion seccion = buscar(codSeccion);
		if(seccion == null) {
			return false;
		}
		
		secciones.remove(seccion);
		return true;
	}
	
	public boolean modificar(Seccion datos) {
		Seccion actual = buscar(datos.getCodSeccion());
		
		if(actual == null) {
			return false;
		}
		
		actual.setCodCurso(datos.getCodCurso());
	    actual.setCodDocente(datos.getCodDocente());
	    actual.setAula(datos.getAula());
	    actual.setHorario(datos.getHorario());
	    return true;
	}
	
}
