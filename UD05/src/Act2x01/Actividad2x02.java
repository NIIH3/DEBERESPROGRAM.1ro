package Act2x01;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Actividad2x02 {
	
	public static int[] matrizMaximo(int longitud, int minimo, int maximo) {
		int[] vector = new int[longitud];
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
		}
		return vector;
	}
	

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = Teclado.leerEntero("¿Numero Entero? ");
			}
		}
 		
		
		System.out.println("MATRIZ:");
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.println(Arrays.toString(matriz[fila]));
		}
		
		//System.out.println("Minimo: " + minimo);
		//System.out.println("Primera posicion del mínimo: " + posMin);
		//System.out.println("Máximo: " + maximo);
		//System.out.println("Primera posicion del máximo: " + posMax);

	}

}
