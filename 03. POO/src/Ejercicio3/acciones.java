package Ejercicio3;

public class acciones {
	public static void main(String[] args) {
		
		Contador c1=new Contador();
		
		c1.setContador(7);
		c1.incrementar();
		System.out.println("Contador 1: "+c1.getContador());
		c1.incrementar();
		c1.incrementar();
		System.out.println("Contador 1: "+c1.getContador());
		c1.decrementar();
		System.out.println("Contador 1: "+c1.getContador());
		
		Contador c2=new Contador (10);
		
		c2.incrementar();
		System.out.println("Contador 2: "+c2.getContador());
		c2.decrementar();
		System.out.println("Contador 2: "+c2.getContador());
		
		Contador c3=new Contador(c2);
		
		System.out.println("Contador 3: "+c3.getContador());
	}
}
