package Ejercicio2;

public class Cuenta {

	private String nomCli;
	private String numCuenta;
	private double interes;
	private double saldo;

	public Cuenta() { // Constructor por defecto.

	}

	public Cuenta(String nomCli, String numCuenta, double interes, double saldo) { // Constructor parámetros.

		this.nomCli = nomCli;
		this.numCuenta = numCuenta;
		this.interes = interes;
		this.saldo = saldo;

	}

	// Constructor copia
	public Cuenta(final Cuenta c) {
		this.nomCli = c.nomCli;
		this.numCuenta = c.numCuenta;
		this.interes = c.interes;
		this.saldo = c.saldo;
	}

	String getNomCli() { // GETTERS
		return nomCli;
	}

	String getNumCuenta() {
		return numCuenta;
	}

	double getInteres() {
		return interes;
	}

	double getSaldo() {
		return saldo;
	}

	void setNomCli(String nomCli) { // SETTERS
		this.nomCli = nomCli;
	}

	void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	void setInteres(double interes) {
		this.interes = interes;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	boolean ingreso(double cantidad) {
		if (cantidad < 0) {
			System.out.println("La cantidad no puede ser negativa.");
			return false;
		} else {
			saldo = saldo + cantidad;
			return true;
		}

	}

	boolean reintegro(double cantidad) {

		if ((cantidad > saldo) || (cantidad < 0)) {

			return false;

		} else {

			saldo = saldo - cantidad;
			return true;

		}
	}

	boolean transferencia(Cuenta c, double cantidad) {

		if (cantidad > saldo) {

			return false;

		} else {

			reintegro(cantidad);
			c.ingreso(cantidad);

			return true;
		}

	}

	@Override
	public String toString() {
		return "Cuenta [nomCli=" + nomCli + ", numCuenta=" + numCuenta + ", interes=" + interes + ", saldo=" + saldo
				+ "]";
	}

}
