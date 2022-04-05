package Ejercicio4;

import java.util.Scanner;

public class Acciones {

	public static void main(String[] args) {

		Libro l1 = new Libro("El quijote", "Cervantes", 1, 0);

		Libro l2 = new Libro();

		Scanner sn = new Scanner(System.in);

		System.out.println("Introduce titulo: ");
		String titulo = sn.nextLine();
		l2.setTitulo(titulo);
		System.out.println("Introduce el autor: ");
		String autor = sn.nextLine();
		l2.setAutor(autor);
		System.out.println("Número de ejemplares del libro: ");
		int ejemplarLibro = sn.nextInt();
		l2.setEjemplaresLibro(ejemplarLibro);
		System.out.println("Número de ejemplares prestados: ");
		int ejemplarPrestado = sn.nextInt();
		l2.setEjemplaresPrestados(ejemplarPrestado);

		System.out.println(l1.toString());

		System.out.println(l1.prestamo());

		System.out.println(l1.devolucion());
		
		System.out.println(l1.prestamo());;
		
		System.out.println(l1.prestamo());
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		sn.close();
	}
}
