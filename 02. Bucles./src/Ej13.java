//Escribe un programa que lea una lista de diez números
//y determine cuántos son positivos, y cuántos son negativos.

import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
			double numero;
			int positivos=0;
			int negativos=0;
			
		System.out.println("Dime 10 numeros cualesquieras:");
		
			for (int i=1; i<=10; i++) {
				numero=sn.nextInt();
				if (numero>0) {
					positivos++;
				} else {
					negativos++;
				}
			}
			sn.close();
			System.out.println(positivos+" son positivos.");
			System.out.println(negativos+" son negativos.");
	}
}
