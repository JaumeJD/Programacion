package Depuracion;

public class OrdenaTabla {

	public static int[] tabla = { 4, 3, 6, 8, 8, 4, 1, 9, 5, 7 };

	public static void main(String[] args) {
		int[] res = ordenaTabla(tabla);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}

	public static int[] ordenaTabla(int[] tabla) {
		int[] tablaRes = tabla;
		int aux;

		for (int i = 0; i < tablaRes.length - 1; i++) {
			for (int j = 0; j < tablaRes.length - 1 - i; j++) {
				if (tablaRes[j] > tablaRes[j + 1]) {
					aux = tablaRes[j];
					tablaRes[j] = tablaRes[j + 1];
					tablaRes[j + 1] = aux;
				}
			}
		}
		return tablaRes;
	}
}