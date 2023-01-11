package Act1x05;

import java.util.Random;

public class Actividad1x05 {

	public static int[] generarVectorAleatorio(int longitud, int minimo, int maximo) {
		int[] vector = new int[longitud];
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = aleatorio.nextInt(anchuraIntervalo) + minimo;
		}
		return vector;
	}
	
	public static void escribirVector(int[]vector) {
		System.out.print("[");
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			System.out.print(vector[posicion]);
			if (posicion != vector.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	
	public static void main(String[] args) {
		final int LONGITUD = 8;
		int[] vectorA = generarVectorAleatorio(LONGITUD, 1, 5);
		int[] vectorB = generarVectorAleatorio(LONGITUD, 1, 5);
		
		System.out.println("VECTOR A:");
		escribirVector(vectorA);
		System.out.println("VECTOR B:");
		escribirVector(vectorB);
		
		for (int posicionA = 0 ; posicionA < vectorA.length ; posicionA++) {
			int contador = 0;
			for (int posicionB = 0 ; posicionB < vectorB.length ; posicionB++) {
				if (vectorA[posicionA] == vectorB[posicionB]) {
					contador++;
				}
			}
			System.out.println("El elemento en la posicion " + posicionA + " del vector A aparece " + contador + " veces en el vector B.");
		}

	}

}
