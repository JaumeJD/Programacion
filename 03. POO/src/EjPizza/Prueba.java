package EjPizza;

public class Prueba {
	public static void main(String[] args) {

		Pizza p1 = new Pizza("margarita", "mediana");
		Pizza p2 = new Pizza("funghi", "familiar");

		p2.sirve();

		Pizza p3 = new Pizza("4 quesos", "familiar");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		p2.sirve();

		System.out.println("Pedidas: " + Pizza.getTotalPedidas());
		System.out.println("Servidas: " + Pizza.getTotalServidas());
	}
}
