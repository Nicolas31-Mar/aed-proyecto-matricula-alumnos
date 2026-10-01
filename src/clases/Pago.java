package clases;

public class Pago {

	private int numPago, numMatricula;
	private double monto;
	private String fecha, hora;

	public Pago(int numPago, int numMatricula, double monto, String fecha, String hora) {
		this.numPago = numPago;
		this.numMatricula = numMatricula;
		this.monto = monto;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getNumPago() {
		return numPago;
	}

	public void setNumPago(int numPago) {
		this.numPago = numPago;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
