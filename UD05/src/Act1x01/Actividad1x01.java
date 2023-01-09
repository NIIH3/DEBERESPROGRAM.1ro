package Act1x01;

import entrada.Teclado;

public class Actividad1x01 {
	
	public static void leerVector(int[] vector) {
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = Teclado.leerEntero("¿Numero Entero " + posicion + "?");
		}
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
		int[] vector = new int [LONGITUD];
		
		leerVector(vector);
		System.out.println("VECTOR: ");
		escribirVector(vector);
		
		int minimo = vector[0];
		int posicionMinimo = 0;
		int maximo = vector[0];
		int posicionMaximo = 0;
		for (int posicion = 1 ; posicion < vector.length ; posicion++) {
			if (vector[posicion] < minimo) {
				minimo = vector[posicion];
				posicionMinimo = posicion;
			}
			if (vector[posicion] > maximo) {
				maximo = vector[posicion];
				posicionMaximo = posicion;
			}
		}
		
	}

}
