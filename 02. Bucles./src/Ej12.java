//Escribe un programa que muestre los n primeros 
//términos de la serie de Fibonacci. El primer 
//término de la serie de Fibonacci es 0, el segundo 
//es 1 y el resto se calcula sumando los dos 
//anteriores, por lo que tendríamos que los términos 
//son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144..
//El número n se debe introducir por teclado.

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int numero,num1,num2;
		
		System.out.println("Introduce el nºcorte de la secuencia: ");
		numero=sn.nextInt();
		System.out.println("---------------");
		
		num1=0;
		num2=1;
		
		for (int i=1; i<=numero; i++) {
			System.out.print(num1+" ");
			num2=num2+num1;
			num1=num2-num1;
		}
		sn.close();
	}	
}
