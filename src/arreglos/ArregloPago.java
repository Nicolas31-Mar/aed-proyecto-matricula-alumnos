
package arreglos;

import java.util.ArrayList;
import clases.Pago;

public class ArregloPago {

    private ArrayList<Pago> pagos = new ArrayList<Pago>();

    public ArregloPago() {

        adicionar(new Pago(1001, 1, 150.00, "01/10/2026", "09:30"));
        adicionar(new Pago(1002, 2, 180.00, "02/10/2026", "10:15"));
    }

    public boolean adicionar(Pago pago) {

        if (buscar(pago.getNumPago()) != null)
            return false;

        pagos.add(pago);
        return true;
    }

    public int tamanio() {
        return pagos.size();
    }

    public Pago obtener(int posicion) {
        return pagos.get(posicion);
    }

    public Pago buscar(int numPago) {

        for (int i = 0; i < tamanio(); i++) {

            Pago pago = obtener(i);

            if (pago.getNumPago() == numPago)
                return pago;
        }

        return null;
    }

    public boolean eliminar(int numPago) {

        Pago pago = buscar(numPago);

        if (pago == null)
            return false;

        pagos.remove(pago);
        return true;
    }

    public boolean modificar(Pago datos) {

        Pago actual = buscar(datos.getNumPago());

        if (actual == null)
            return false;

        actual.setNumMatricula(datos.getNumMatricula());
        actual.setMonto(datos.getMonto());
        actual.setFecha(datos.getFecha());
        actual.setHora(datos.getHora());

        return true;
    }
}
