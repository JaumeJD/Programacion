//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
//El carácter con el que se pinta la pirámide también se debe pedir por teclado.

import java.util.Scanner;

public class Ej19 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner n=new Scanner(System.in);
		String caracter;
		int alt;
		int cont=1;
		
		System.out.println("Vamos a dibujar una pirámide.");
		System.out.println("Dime la altura que deseas para la pirámide: ");
		alt=s.nextInt();
		System.out.println("Que carácter quieres usar para la piramide: ");
		caracter=n.nextLine();
		System.out.println("La pirámide dibujada sería así:");
		System.out.println();
		
		do {
			for (int i=1;i<=alt; i++) {
				System.out.println(caracter);
					
				for (int j=1;j<=cont; j++) {
					System.out.print(caracter);
					}
					
				cont++;
					
				}
		} while (cont<10);
		
		
		s.close();
		n.close();
	}
}
