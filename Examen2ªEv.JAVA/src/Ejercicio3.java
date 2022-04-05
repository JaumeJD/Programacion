import java.util.Scanner;

public class Ejercicio3 {

	public static void escribirMenu() {
		System.out.println("1.Nuevo vehículo.");
		System.out.println("2.Listar vehículos.");
		System.out.println("3.Buscar vehículos.");
		System.out.println("4.Modificar kms de vehículo.");
		System.out.println("5.Salir.");
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numeroVehiculos;
		do {
			System.out.println("¿Cuántos vehículos gestionaremos?");
			numeroVehiculos = sn.nextInt();
			if (numeroVehiculos < 1) {
				System.out.println("Debe haber un vehículo como mínimo.");
			}
			if (numeroVehiculos > 50) {
				System.out.println("El número no puede exceder 50 vehículos.");
			}
		} while (numeroVehiculos < 1 | numeroVehiculos > 50);
		Vehiculos[] concesionario = new Vehiculos[numeroVehiculos];

		System.out.println();
		escribirMenu();

		sn.close();
	}
}
