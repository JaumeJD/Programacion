package Ejercicio2;

import java.util.Scanner;

import Ejercicio2.Cuenta;

public class gestion {
	public static void main(String[] args) {

		Cuenta c1 = new Cuenta();

		Scanner sn = new Scanner(System.in);
		System.out.println("Datos de la cuenta1.");
		System.out.println("Nombre cliente:");
		String nomCli = sn.nextLine();
		c1.setNomCli(nomCli);
		System.out.println("Número:");
		String numCuenta = sn.next();
		c1.setNumCuenta(numCuenta);
		System.out.println("Tipo de interés:");
		double interes = sn.nextDouble();
		c1.setInteres(interes);
		System.out.println("Saldo:");
		double saldo = sn.nextDouble();
		c1.setSaldo(saldo);
		
		System.out.println();
		
		System.out.println("Datos de la cuenta1.");
		System.out.println("Nombre cliente:");
		System.out.println(c1.getNomCli());
		System.out.println("Número:");
		System.out.println(c1.getNumCuenta());
		System.out.println("Tipo de interés:");
		System.out.println(c1.getInteres());
		System.out.println("Saldo:");
		System.out.println(c1.getSaldo());
		
		System.out.println();
		
		c1.ingreso(200);
		System.out.println("Le hacemos un ingreso de 200€ a cuenta1:");
		System.out.println("Salgo cuenta1 = " + c1.getSaldo());
		sn.close();
		
System.out.println();
		
		Cuenta c2=new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);
		
		System.out.println("Datos de la cuenta2:");
		System.out.println("Nombre cliente:");
		System.out.println(c2.getNomCli());
		System.out.println("Número:");
		System.out.println(c2.getNumCuenta());
		System.out.println("Tipo de interés:");
		System.out.println(c2.getInteres());
		System.out.println("Saldo:");
		System.out.println(c2.getSaldo());
		
		System.out.println();
		Cuenta c3=new Cuenta(c1);
		
		System.out.println("Datos de la cuenta3.");
		System.out.println("Nombre cliente:");
		System.out.println(c3.getNomCli());
		System.out.println("Número:");
		System.out.println(c3.getNumCuenta());
		System.out.println("Tipo de interés:");
		System.out.println(c3.getInteres());
		System.out.println("Saldo:");
		System.out.println(c3.getSaldo());
		
		c3.transferencia(c2, 100);
		System.out.println("Saldo cuenta3 es: " + c3.getSaldo());
		System.out.println("Saldo cuenta2 es: " + c2.getSaldo());
	}
}
