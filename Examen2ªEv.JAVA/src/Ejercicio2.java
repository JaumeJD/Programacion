import java.util.Scanner;

public class Ejercicio2 {

	public static void escribirMenu() {
		System.out.println("'''''''''''''''''''''''''''");
		System.out.println("1.Nuevo vehículo.");
		System.out.println("2.Ver matrícula.");
		System.out.println("3.Ver número de kilómetros.");
		System.out.println("4.Actualizar kilómetros.");
		System.out.println("5.Ver años de antigüedad.");
		System.out.println("6.Mostrar propietario.");
		System.out.println("7.Mostrar descripción.");
		System.out.println("8.Mostrar precio.");
		System.out.println("9.Salir.");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String marca, matricula, descripcion, nombrePropietario, dniPropietario;
		int numeroKilometros, fecha;
		double precio;
		boolean salir = false;
		Vehiculos v1 = new Vehiculos();
		do {
			escribirMenu();
			int tecla = sn.nextInt();
			if (tecla == 1) {

				System.out.println("Introduzca los datos del nuevo vehículo.");
				System.out.println("Marca: ");
				marca = sn.nextLine();
				marca = sn.nextLine();
				v1.setMarca(marca);
				System.out.println("Matrícula: ");
				matricula = sn.nextLine();
				v1.setMatricula(matricula);
				System.out.println("Número de kilómetros: ");
				numeroKilometros = sn.nextInt();
				v1.setNumeroKilometros(numeroKilometros);
				System.out.println("Año de matriculación: ");
				fecha = sn.nextInt();
				v1.setFecha(fecha);
				System.out.println("Descripción: ");
				descripcion = sn.nextLine();
				descripcion = sn.nextLine();
				v1.setDescripcion(descripcion);
				System.out.println("Precio: ");
				precio = sn.nextDouble();
				v1.setPrecio(precio);
				System.out.println("Nombre del propietario: ");
				nombrePropietario = sn.nextLine();
				nombrePropietario = sn.nextLine();
				v1.setNombrePropietario(nombrePropietario);
				System.out.println("DNI del propietario: ");
				dniPropietario = sn.nextLine();
				v1.setDniPropietario(dniPropietario);

				if (fecha > 2022 | numeroKilometros < 0) {
					System.out.println("Los datos introducidos no son correctos. " + "Por favor, repita el proceso.");
				}
			}
			if (tecla == 2) {

				System.out.println("Matrícula: " + v1.getMatricula());
			}
			if (tecla == 3) {
				System.out.println("Número de kilómetros: " + v1.getNumeroKilometros());
			}
			if (tecla == 4) {
				System.out.println("Introduzca el número de kilometros actual.");
				numeroKilometros = sn.nextInt();
				if (numeroKilometros > v1.getNumeroKilometros()) {
					v1.setNumeroKilometros(numeroKilometros);
					System.out.println("Kilómetros actuales: " + v1.getNumeroKilometros() + "km");
				} else {
					System.out.println("Cifra no válida.");
				}
			}
			if (tecla == 5) {

				System.out.println("Antigüedad: " + v1.getAnios() + " años.");
			}
			if (tecla == 6) {
				System.out.println("Nombre del propietario: " + v1.getNombrePropietario());
				System.out.println("DNI del propietario: " + v1.getDniPropietario());
			}
			if (tecla == 7) {
				System.out.println("Descripción: " + v1.getDescripcion() + " Su matrícula es " + v1.getMatricula()
						+ " y tiene " + v1.getNumeroKilometros() + " kilómetros.");

			}
			if (tecla == 8) {
				System.out.println("Precio: " + v1.getPrecio() + "€");
			}
			if (tecla == 9) {
				salir = true;
				break;
			}
		} while (!salir);
		sn.close();
	}
}
