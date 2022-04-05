//Escribe un programa que muestre en tres columnas, 
//el cuadrado y el cubo de los 5 primeros números 
//enteros a partir de uno que se introduce por teclado.

import java.util.Scanner;
import static java.lang.Math.*;

public class Ej11 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int num;
		System.out.println("Dame un número:");
		num=sn.nextInt();
		for (int i = num; i < num+5; i++) {
			System.out.println(i+", "+pow(i,2)+", "+pow(i,3));
		}
		sn.close();
	}
}
