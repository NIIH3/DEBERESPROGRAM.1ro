package Act1x02;

import entrada.Teclado;

public class Actividad1x02 {

	public static int[] leerVector(int longitud) {
		int[] vector = new int[longitud];
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = Teclado.leerEntero("¿Numero Entero " + posicion + "?");
		}
		return vector;
	}
	
	public static void escribirVector(int[]vector) {
		System.out.println("[");
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			System.out.println();
			if (posicion != vector.length - 1) {
				System.out.print(",");
			}
		}
	}
	
	
	public static void main(String[] args) {
		final int LONGITUD = 10;
		System.out.println("VECTOR A: ");
		int[]vectorA = leerVector(LONGITUD);
		System.out.println("VECTOR B: ");
		int[]vectorB = leerVector(LONGITUD);
		
		int[] vectorSuma = new int[LONGITUD];
		for(int posicion = 0 ; posicion < vectorSuma.length ; posicion++) {
			vectorSuma[posicion] = vectorA[posicion] + vectorB[posicion];
		}
		int[] vectorProducto = new int[LONGITUD];
		for(int posicion = 0 ; posicion < vectorProducto.length ; posicion++) {
			vectorProducto[posicion] = vectorA[posicion] * vectorB[posicion];
		}
		
		System.out.println("VECTOR A:");
		escribirVector(vectorA);
		System.out.println("VECTOR B:");
		escribirVector(vectorB);
		System.out.println("VECTOR SUMA:");
		escribirVector(vectorSuma);
		System.out.println("VECTOR PRODUCTO:");
		escribirVector(vectorProducto);

	}

}
