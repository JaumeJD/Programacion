//Realiza un programa que nos diga cuántos dígitos 
//tiene un número introducido por teclado.

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num=sn.nextInt();
		int cont=1;
		while (num>=10) {
			num=num/10;
			cont=cont+1;
		}
		System.out.println("El número introducido tiene "+cont+" dígitos.");
		sn.close();
	}
}
