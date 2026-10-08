
package arreglos;

import java.util.ArrayList;
import clases.Apoderado;

public class ArregloApoderado {

    private ArrayList<Apoderado> apoderados =
            new ArrayList<Apoderado>();

    public ArregloApoderado() {

        adicionar(new Apoderado(
            1001, "José Antonio", "Pérez Gómez",
            "45678912", 987654321, 1001
        ));

        adicionar(new Apoderado(
            1002, "Rosa María", "Torres Díaz",
            "47896521", 965432187, 1002
        ));
    }

    public boolean adicionar(Apoderado apoderado) {

        if (buscar(apoderado.getCodApoderado()) != null)
            return false;

        apoderados.add(apoderado);
        return true;
    }

    public int tamanio() {
        return apoderados.size();
    }

    public Apoderado obtener(int posicion) {
        return apoderados.get(posicion);
    }

    public Apoderado buscar(int codApoderado) {

        for (int i = 0; i < tamanio(); i++) {

            Apoderado apoderado = obtener(i);

            if (apoderado.getCodApoderado() == codApoderado)
                return apoderado;
        }

        return null;
    }

    public boolean eliminar(int codApoderado) {

        Apoderado apoderado = buscar(codApoderado);

        if (apoderado == null)
            return false;

        apoderados.remove(apoderado);
        return true;
    }

    public boolean modificar(Apoderado datos) {

        Apoderado actual = buscar(datos.getCodApoderado());

        if (actual == null)
            return false;

        actual.setNombres(datos.getNombres());
        actual.setApellidos(datos.getApellidos());
        actual.setDni(datos.getDni());
        actual.setCelular(datos.getCelular());
        actual.setCodAlumno(datos.getCodAlumno());

        return true;
    }
}
