//Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por 
//teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos 
//e ir incrementando de 7 en 7.

import java.util.Scanner;

public class Ej18 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m;
		
		do {
			System.out.println("Dime un número de inicio que sea entero:");
			n=s.nextInt();
			System.out.println("Dime un número de fin que sea entero:");
			m=s.nextInt();
			if (n==m) {
				System.out.println("Que sean distintos, por favor.");
			}
			
		} while (n==m);
		System.out.println("La serie de numeros sería: ");
		for (int i=n; i<=m; i=i+7) {
			System.out.print(i+" ");
		}
		s.close();
		}
	}