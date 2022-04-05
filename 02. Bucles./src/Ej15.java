//Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por 
//pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. 
//No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, 
//se deberán mostrar 21, 22, 23, 24 y 25.

import java.util.Scanner;
import static java.lang.Math.*;

public class Ej15 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		double base;
		int exp;
		System.out.println("Dame la base de un numero (Real):");
		base=sn.nextDouble();
		System.out.println("Ahora dime el exponente al que elevarla (entero positivo):");
		exp=sn.nextInt();
		for (int i=1; i<=exp; i++) {
			System.out.println(base+" elevado a "+i+" es igual a "+pow(base,i));
		}
		sn.close();
	}
}
