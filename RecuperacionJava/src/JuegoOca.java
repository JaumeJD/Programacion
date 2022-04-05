import java.util.Scanner;

public class JuegoOca {

	public static int tiraDados(int minDado, int maxDado) { // Valor de dados
		int num;

		num = (int) ((Math.random() * maxDado) - minDado) + 1;

		return num;
	}

	public static void pintaPista(int j1, int j2, int tamcircuito) { // Imprime tablero
		for (int i = 1; i <= tamcircuito; i++) {
			System.out.print("\t" + i);
		}

		System.out.println();

		for (int i = 0; i < j1; i++) {
			System.out.print("\t");
		}
		System.out.println("J1");
		for (int i = 0; i < j2; i++) {
			System.out.print("\t");
		}
		System.out.println("J2");
		return;
	}

	public static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) { // Primo o no

		for (int i = 2; i < (tirada1 + tirada2); i++) {

			if (((tirada1 + tirada2) % i) == 0) {
				return false;
			}

		}
		return true;

	}

	public static void imprimeComoVaLaCarrera(String nomJ1, String nomJ2, int j1, int j2) { // Posicion jugadores

		if (j1 == j2) {
			System.out.println("¡Van empatados!");
		} else {
			if (j1 > j2) {
				System.out.println(nomJ1 + " va ganando.");
			} else {
				System.out.println(nomJ2 + " va ganando.");
			}
		}

	}

	public static boolean esGanador(String nomJ1, String nomJ2, int j1, int j2, // Ganador
			int tamcircuito, boolean victoria) {
		// o
		// no
		if (j1 >= tamcircuito) {
			System.out.println("JUGADOR GANADOR: " + nomJ1);
			return true;

		} else {
			if (j2 >= tamcircuito) {
				System.out.println("JUGADOR GANADOR: " + nomJ2);
				return true;

			} else {
				pintaPista(j1, j2, tamcircuito);
				return false;

			}
		}
	}

	public static void main(String[] args) {

		int tamcircuito = 11;
		int j1 = 0, j2 = 0;
		int mindado, maxdado;
		int tirada1, tirada2;
		String nomJ1, nomJ2;
		Boolean victoria = false;

		Scanner sn = new Scanner(System.in);

		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cual es el número mínimo del dado?");
		mindado = sn.nextInt();
		System.out.println("¿Cual es el número máximo del dado?");
		maxdado = sn.nextInt();
		System.out.println("¿Cual es el nombre del jugador 1?");
		nomJ1 = sn.next();
		System.out.println("¿Cual es el nombre del jugador 2?");
		nomJ2 = sn.next();
		while (nomJ1 == nomJ2) {
			System.out.println("Los dos jugadores no pueden llamarse igual.");
			System.out.println("¿Cual es el nombre del jugador 2?");
			nomJ2 = sn.next();
		}
		System.out.println();

		System.out.println("¡COMENCEMOS A JUGAR!");

		System.out.println();

		pintaPista(j1, j2, tamcircuito);

		System.out.println();

		do {

			System.out.println("Introduce cualquier tecla para continuar.");
			String tecla = sn.next();

			System.out.println();

			System.out.println("Turno para el jugador 1: " + nomJ1);
			tirada1 = tiraDados(mindado, maxdado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
			tirada2 = tiraDados(mindado, maxdado);
			System.out.println("Ha sacadi un " + tirada2 + " en la segunda tirada.");
			if (sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("¡TIRADA VÁLIDA!");
				j1 = j1 + tirada1 + tirada2;
				pintaPista(j1, j2, tamcircuito);
				System.out.println();
				imprimeComoVaLaCarrera(nomJ1, nomJ2, j1, j2);

			} else {
				System.out.println("¡TIRADA NO VÁLIDA!");
				System.out.println("No suma puntos ya que la suma de los dos números NO ES PRIMO");
				pintaPista(j1, j2, tamcircuito);
				System.out.println();
				imprimeComoVaLaCarrera(nomJ1, nomJ2, j1, j2);
			}
			System.out.println();

			System.out.println("Turno para el jugador 2: " + nomJ2);
			tirada1 = tiraDados(mindado, maxdado);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
			tirada2 = tiraDados(mindado, maxdado);
			System.out.println("Ha sacadi un " + tirada2 + " en la segunda tirada.");
			if (sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("¡TIRADA VÁLIDA!");
				j2 = j2 + tirada1 + tirada2;
				pintaPista(j1, j2, tamcircuito);
				System.out.println();
				imprimeComoVaLaCarrera(nomJ1, nomJ2, j1, j2);

			} else {
				System.out.println("¡TIRADA NO VÁLIDA!");
				System.out.println("No suma puntos ya que la suma de los dos números NO ES PRIMO");
				pintaPista(j1, j2, tamcircuito);
				System.out.println();
				imprimeComoVaLaCarrera(nomJ1, nomJ2, j1, j2);
			}

			System.out.println();

		} while (esGanador(nomJ1, nomJ2, j1, j2, tamcircuito, victoria) == false);

		sn.close();
	}
}
