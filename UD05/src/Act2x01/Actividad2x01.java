package Act2x01;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Actividad2x01 {
	
	public static void leerMatriz(int[][] matriz) {
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = Teclado.leerEntero("¿Numero Entero? ");
			}
		}
	}
	
	public static void escribirMatriz(int[][] matriz) {
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.println(Arrays.toString(matriz[fila]));
		}
	}
	

	public static void main(String[] args) {
		final int NUMERO_FILAS = 4;
		final int NUMERO_COLUMNAS = 4;
		int[][] matriz = new int[NUMERO_FILAS][NUMERO_COLUMNAS];
		
		leerMatriz(matriz);
		System.out.println("\nMATRIZ:");
		escribirMatriz(matriz);
		
		int minimo = matriz[0][0];
		int filaMinimo = 0;
		int columnaMinimo = 0;
		int maximo = matriz[0][0];
		int filaMaximo = 0;
		int columnaMaximo = 0;
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				if (matriz[fila][columna] < minimo) {
					minimo = matriz[fila][columna];
					filaMinimo = fila;
					columnaMinimo = columna;
				}
				if (matriz[fila][columna] > maximo) {
					maximo = matriz[fila][columna];
					filaMaximo = fila;
					columnaMaximo = columna;
				}
			}
		}
		
		System.out.println("Mínimo: " + minimo);
		System.out.println("Primera posicion del Mínimo: (" + filaMinimo + "," + columnaMinimo + ")");
		System.out.println("Máximo: " + maximo);
		System.out.println("Primera posicion del Máximo: (" + filaMaximo + "," + columnaMaximo + ")");		

	}

}
