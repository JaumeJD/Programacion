//Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por 
//teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).

import java.util.Scanner;

public class Ej17 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int num;
		int acum=0;
		System.out.println("Dime un número entero positivo.");
		num=sn.nextInt();
		
		while (num<0) {
			System.out.println("He dicho un número entero positivo, por favor.");
			num=sn.nextInt();
		}
		
		for (int i=num+1; i<=num+100; i++) {
			acum=acum+i;
		}
		System.out.println("La suma de los 100 números siguientes al introducido es "+acum);
		sn.close();
	}
}
