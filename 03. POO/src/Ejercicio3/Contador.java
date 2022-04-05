package Ejercicio3;

public class Contador {

	private int contador;

	public Contador() { // Constructor por defecto.

	}

	public Contador(int contador) { // Constructor con parámetros.
		if (contador < 0) {
			this.contador = 0;
		} else {
			this.contador = contador;
		}
	}

	public Contador(final Contador c) { // Constructor copia.
		this.contador = c.contador;
	}

	int getContador() { // Getter
		return contador;
	}

	void setContador(int contador) { // Setter
		this.contador = contador;
	}

	int incrementar() {

		return contador++;
	}

	int decrementar() {
		if (contador <= 0) {
			return contador;
		} else {

			return contador--;
		}
	}

}
