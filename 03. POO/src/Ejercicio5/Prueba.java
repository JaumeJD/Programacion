package Ejercicio5;

public class Prueba {
	public static void main(String[] args) {

		// SE CREAN 4 FRACCIONES.
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);
		Fraccion f3 = new Fraccion();
		Fraccion f4 = new Fraccion(4);

		// MOSTRAR PRIMERAS FRACCIONES.
		System.out.println("primera fracción:" + f1);
		System.out.println("segunda fracción:" + f2);
		System.out.println("tercera fracción:" + f3);
		System.out.println("cuarta fracción:" + f4);

		// OPERACIONES CON ESAS FRACCIONES.
		Fraccion suma = f1.sumar(f2);
		Fraccion resta = f1.restar(f3);
		Fraccion producto = f1.multiplicar(f4);
		Fraccion cociente = f1.dividir(f2);

		// MOSTRAR RESULTADOS.
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " + " + f3 + " = " + resta);
		System.out.println(f1 + " + " + f4 + " = " + producto);
		System.out.println(f1 + " + " + f2 + " = " + cociente);

	}
}
