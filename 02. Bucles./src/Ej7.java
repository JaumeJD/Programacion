//Realiza el control de acceso a una caja fuerte. 
//La combinación será un número de 4 cifras. 
//El programa nos pedirá la combinación para abrirla.
//Si no acertamos, se nos mostrará el mensaje 
//“Lo siento, esa no es la 
//combinación” y si acertamos se nos dirá 
//“La caja fuerte se ha abierto satisfactoriamente”. 
//Tendremos cuatro 
//oportunidades para abrir la caja fuerte.

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		for (int i=1; i<=4; i++) {
			System.out.println("Introduce la contraseña:");
			int pass=sn.nextInt();
			if (pass==1234) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
				i=4;
			} else {
				System.out.println("Lo siento, esa no es la combinación.");
			}
			sn.close();
		}
	}
}
