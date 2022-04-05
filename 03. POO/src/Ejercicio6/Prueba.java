package Ejercicio6;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("Dame el día de una fecha:");
		int dia = sn.nextInt();
		System.out.println("Ahora dame el mes:");
		int mes = sn.nextInt();
		System.out.println("Por último dame el año(4 dígitos):");
		int anyo = sn.nextInt();

		Fecha f1 = new Fecha(dia, mes, anyo);
		System.out.println(f1);
		if (f1.fechaCorrecta(f1)) {
			System.out.println("Fecha introducida: " + f1.toString(f1));
		}
		System.out.println("Los 10 días siguientes son:");
		for (int i = 0; i < 10; i++) {
			f1.diaSiguiente(f1);
			f1.toString(f1);
		}

		sn.close();
	}
}
