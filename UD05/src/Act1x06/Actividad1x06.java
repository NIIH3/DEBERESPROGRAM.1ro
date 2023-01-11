package Act1x06;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Actividad1x06 {

	public static int[] vectorRandom(int longitud, int minimo, int maximo) {
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
	
	public static int[] fusionarVectores(int[]vector1, int[]vector2) {
		int[] vectorFusion = new int[vector1.length + vector2.length];
		int posicionResultado = 0;
		for (int posicion = 0 ; posicion < vector1.length ; posicion++) {
			vectorFusion[posicionResultado] = vector1[posicion];
			posicionResultado++;
		}
		for (int posicion = 0 ; posicion < vector2.length ; posicion++) {
			vectorFusion[posicionResultado] = vector2[posicion];
			posicionResultado++;
		}
		return vectorFusion;
	}
	
	public static void main(String[] args) {
		int longitudA = Teclado.leerNatural("¿Longitud del Vector A?");
		int longitudB = Teclado.leerNatural("¿Longitud del Vector B?");
		int[] vectorA = vectorRandom(longitudA, -1000, 1000);
		int[] vectorB = vectorRandom(longitudB, -1000, 1000);
		
		
		System.out.println("VECTOR A:");
		System.out.println(Arrays.toString(vectorA));
		System.out.println("VECTOR B:");
		System.out.println(Arrays.toString(vectorB));
		
		int[] vectorFusion = fusionarVectores(vectorA, vectorB);
		System.out.println("Fusion de Vectores:");
		System.out.println(Arrays.toString(vectorFusion));
	}

}
