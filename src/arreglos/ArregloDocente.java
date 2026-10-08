
package arreglos;

import java.util.ArrayList;
import clases.Docente;

public class ArregloDocente {

    private ArrayList<Docente> docentes = new ArrayList<Docente>();

    public ArregloDocente() {

        adicionar(new Docente(
            1001, "Juan Carlos", "Ramírez Torres",
            "45678912", 987654321, "Matemática"
        ));

        adicionar(new Docente(
            1002, "María Elena", "Flores Díaz",
            "47896521", 965432187, "Comunicación"
        ));
    }

    public boolean adicionar(Docente docente) {

        if (buscar(docente.getCodDocente()) != null)
            return false;

        docentes.add(docente);
        return true;
    }

    public int tamanio() {
        return docentes.size();
    }

    public Docente obtener(int posicion) {
        return docentes.get(posicion);
    }

    public Docente buscar(int codDocente) {

        for (int i = 0; i < tamanio(); i++) {

            Docente docente = obtener(i);

            if (docente.getCodDocente() == codDocente)
                return docente;
        }

        return null;
    }

    public boolean eliminar(int codDocente) {

        Docente docente = buscar(codDocente);

        if (docente == null)
            return false;

        docentes.remove(docente);
        return true;
    }

    public boolean modificar(Docente datos) {

        Docente actual = buscar(datos.getCodDocente());

        if (actual == null)
            return false;

        actual.setNombres(datos.getNombres());
        actual.setApellidos(datos.getApellidos());
        actual.setDni(datos.getDni());
        actual.setCelular(datos.getCelular());
        actual.setEspecialidad(datos.getEspecialidad());

        return true;
    }
}

