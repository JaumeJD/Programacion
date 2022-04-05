//Escribe un programa que calcule la media
//de un conjunto de números positivos introducidos
//por teclado. A priori, el programa no sabe
//cuántos números se introducirán. El usuario
//indicará que ha terminado de introducir los
//datos cuando meta un número negativo.

import java.util.Scanner;
public class Ej10 {
	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	double media=0;
	int acum=0;
	int cont=0;
	int num;
	
	do {
		System.out.println("Introduce número: ");
		num=sn.nextInt();
		if (num>0) {
			cont++;
			acum=acum+num;
		}
	} while (num>0);
	media=acum/cont;
	System.out.println("La media es de los positivos es "+media);
	sn.close();
	}
}