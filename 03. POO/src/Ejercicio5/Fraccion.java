package Ejercicio5;

public class Fraccion {

	private int num;
	private int den;

	public Fraccion() { // CONSTRUCTOR POR DEFECTO
		// Debe generar el valor neutro que es 0/1
		num = 0;
		den = 1;
	}

	public Fraccion(int num, int den) { // CONSTRUCTOR PARAMETROS
		// Debo evitar crear fracciones con divisor 0
		this.num = num;
		if (den == 0) {
			den = 1;
		}
		this.den = den;
		// Devuelvo la fraccion simplificada
		simplificar();
	}

	public Fraccion(int num) {
		this.num = num;
		this.den = 1;
	}

	public Fraccion(final Fraccion f) { // CONSTRUCTOR COPIA
		num = f.num;
		den = f.den;
	}

	public int getNum() { // GETTERS
		return num;
	}

	public int getDen() {
		return den;
	}

	public void setNum(int num) { // SETTERS
		this.num = num;
	}

	public void setDen(int den) {
		this.den = den;
	}

	// Cálculo del máximo común divisor por el algoritmo de Euclides
	private int mcd() {
		int u = Math.abs(num); // valor absoluto del numerador
		int v = Math.abs(den); // valor absoluto del denominador
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public void simplificar() {
		int n = mcd();
		num = num / n;
		den = den / n;
	}

	public String toString() {

		String mensaje = num + "/" + den;

		return mensaje;
	}

	public Fraccion sumar(Fraccion f) {
		Fraccion aux = new Fraccion();

		aux.num = num * f.den + den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
	}

	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();

		aux.num = num * f.den - den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
	}

	public Fraccion multiplicar(Fraccion f) {
		Fraccion aux = new Fraccion();

		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;
	}

	public Fraccion dividir(Fraccion f) {
		Fraccion aux = new Fraccion();

		aux.num = num * f.den;
		aux.den = den * f.num;
		aux.simplificar();
		return aux;
	}
}
