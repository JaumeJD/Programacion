package EjPizza;

public class Pizza {
	private String tamaño;
	private String tipo;
	private String estado;
	private static int pedidas = 0;
	private static int servidas = 0;

	public Pizza() { // Constructor por defecto
		Pizza.pedidas++;
		this.estado = "pedida";
	}

	public Pizza(String tamaño, String tipo) { // Constructor parámetros
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = "pedida";
		Pizza.pedidas++;
	}

	public Pizza(final Pizza p) { // Constructor copia
		this.tamaño = p.tamaño;
		this.tipo = p.tipo;
		this.estado = "pedida";
		Pizza.pedidas++;
	}

	public String getTamaño() { // GETTERS
		return tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEStado() {
		return estado;
	}

	public static int getTotalPedidas() {
		return pedidas;
	}

	public static int getTotalServidas() {
		return servidas;
	}

	public void setTamaño(String tamaño) { // SETTERS
		this.tamaño = tamaño;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void sirve() {
		if (Pizza.pedidas <= 0) {
			System.out.println("Esa pizza ya se ha servido.");
		} else {
			servidas++;
			pedidas--;
		}
	}

	public String toString() {
		String mensaje = "Pizza " + tamaño + " " + tipo + ", " + estado;
		return mensaje;
	}

}
