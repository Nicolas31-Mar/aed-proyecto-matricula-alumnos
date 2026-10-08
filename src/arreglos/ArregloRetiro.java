
package arreglos;

import java.util.ArrayList;
import clases.Retiro;

public class ArregloRetiro {

    private ArrayList<Retiro> retiros = new ArrayList<Retiro>();

    public ArregloRetiro() {

        adicionar(new Retiro(1001, 1, "01/10/2026", "09:30"));
        adicionar(new Retiro(1002, 2, "02/10/2026", "10:15"));
    }

    public boolean adicionar(Retiro retiro) {

        if (buscar(retiro.getNumRetiro()) != null)
            return false;

        retiros.add(retiro);
        return true;
    }

    public int tamanio() {
        return retiros.size();
    }

    public Retiro obtener(int posicion) {
        return retiros.get(posicion);
    }

    public Retiro buscar(int numRetiro) {

        for (int i = 0; i < tamanio(); i++) {

            Retiro retiro = obtener(i);

            if (retiro.getNumRetiro() == numRetiro)
                return retiro;
        }

        return null;
    }

    public boolean eliminar(int numRetiro) {

        Retiro retiro = buscar(numRetiro);

        if (retiro == null)
            return false;

        retiros.remove(retiro);
        return true;
    }

    public boolean modificar(Retiro datos) {

        Retiro actual = buscar(datos.getNumRetiro());

        if (actual == null)
            return false;

        actual.setNumMatricula(datos.getNumMatricula());
        actual.setFecha(datos.getFecha());
        actual.setHora(datos.getHora());

        return true;
    }
}
