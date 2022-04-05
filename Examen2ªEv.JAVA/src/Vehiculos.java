
public class Vehiculos {
	private String marca, matricula, descripcion, nombrePropietario, dniPropietario;
	private int numeroKilometros, fecha;
	private double precio;

	public Vehiculos() { // CONSTRUCTOR DEFECTO

	}

	public Vehiculos(String marca, String matricula, String fecha, String descripcion, String nombrePropietario,
			String dniPropietario, int numeroKilometros, double precio) { // CONSTRUCTOR PARÁMETROS

	}

	public Vehiculos(final Vehiculos V) { // CONSTRUCTOR COPIA

	}

	public String getMarca() { // GETTERS AND SETTERS
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}

	public int getNumeroKilometros() {
		return numeroKilometros;
	}

	public void setNumeroKilometros(int numeroKilometros) {
		this.numeroKilometros = numeroKilometros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnios() {
		int edad;
		edad = 2022 - fecha;
		return edad;
	}
	
}
