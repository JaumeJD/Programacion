//Escribe un programa que diga si un número introducido por teclado es o no primo. 
//Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int num;
		int cont=0;
		System.out.println("Introduce un número entero:");
		num=sn.nextInt();
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				cont++;
			}
		}
		if (cont==2) {
			System.out.println("El número introducido es primo");
		} else {
			System.out.println("El número introducido no es primo");
		}
		sn.close();
	}
}
