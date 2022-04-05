//Escribe un programa que pida una base y
//un exponente (entero positivo) y que calcule la potencia.

import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		double base;
		int exp;
		double acum=1;
		System.out.println("Dame un numero:");
		base=sn.nextDouble();
		System.out.println("Ahora dame el exponente al que quiere elevarlo:");
		exp=sn.nextInt();
		for (int i=1; i<=exp; i++) {
			acum=acum*base;
		}
		System.out.println("La potencia es "+acum);
		sn.close();
	}
}
