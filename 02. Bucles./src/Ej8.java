//Muestra la tabla de multiplicar de un 
//número introducido por teclado.

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Dame un número.");
		int num=sn.nextInt();
				for (int i=1; i<=10; i++) {
					System.out.println(num+" por "+i+" es igual a "+(num*i));
				}
			sn.close();
	}
}
