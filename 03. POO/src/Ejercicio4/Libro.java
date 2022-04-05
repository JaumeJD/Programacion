package Ejercicio4;

/**
 * La clase Libro se utiliza para definir unas características específicas de un
 * conjunto de libros que se crearan al ejecutar el programa.
 * 
 * @version 03-2022
 * @author jgarveg163
 * @since 28-03-2022
 */

public class Libro {
	/**
	 * <h3>Atributo título del libro.</h3>
	 */
	private String titulo;
	/**
	 * <h3>Atributo nombre del autor.</h3>
	 */
	private String autor;
	/**
	 * <h3>Atributo sobre ejemplares en stock.</h3>
	 */
	private int ejemplarLibro;
	/**
	 * <h3>Atributo sobre ejemplares prestados.</h3>
	 */
	private int ejemplarPrestado;

	public Libro() { // CONSTRUCTOR POR DEFECTO

	}

	// CONSTRUCTOR PARAMETROS
	public Libro(String titulo, String autor, int ejemplarLibro, int ejemplarPrestado) {

		this.titulo = titulo;
		this.autor = autor;
		this.ejemplarLibro = ejemplarLibro;
		this.ejemplarPrestado = ejemplarPrestado;
	}

	public String getTitulo() { // GETTERS
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getEjemplaresLibro() {
		return ejemplarLibro;
	}

	public int getEjemplaresPrestado() {
		return ejemplarPrestado;
	}

	public void setTitulo(String titulo) { // SETTERS
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEjemplaresLibro(int ejemplarLibro) {
		this.ejemplarLibro = ejemplarLibro;
	}

	public void setEjemplaresPrestados(int ejemplarPrestado) {
		this.ejemplarPrestado = ejemplarPrestado;
	}

	/**
	 * 
	 * @return
	 *         <h3>
	 *         <ul>
	 *         <li>true:Existe al menos 1 libro en stock para prestar.</li>
	 *         <li>false:No quedan ejemplares en stock para prestar.</li>
	 *         </ul>
	 *         </h3>
	 */
	public boolean prestamo() {
		if (ejemplarLibro >= 1) {
			ejemplarLibro--;
			ejemplarPrestado++;
			return true;

		} else {
			System.out.println("No quedan ejemplares del libro.");
			return false;
		}
	}

	/**
	 * 
	 * @return
	 *         <h3>
	 *         <ul>
	 *         <li>true:Hay al menos un libro prestado para devolver.</li>
	 *         <li>false:No existen libros que devolve.</li>
	 *         </ul>
	 *         </h3>
	 */
	public boolean devolucion() {
		if (ejemplarPrestado >= 1) {
			ejemplarPrestado--;
			ejemplarLibro++;
			return true;

		} else {
			return false;
		}
	}

	/**
	 * @return
	 *         <h2>Mensaje String con la información del titulo del libro, el autor
	 *         que lo escribió y el numero de ejemplares en stock y/o prestados</h2>
	 */
	public String toString() {
		String mensaje = "Titulo: " + titulo + ". Autor: " + autor + ". Nº ejemplares: " + ejemplarLibro
				+ ". Nº prestados: " + ejemplarPrestado + ".";

		return mensaje;

	}

}
