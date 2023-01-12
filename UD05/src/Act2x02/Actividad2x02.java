package Act2x02;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Actividad2x02 {
	
	public static void rellenar(int[][] matriz, int minimo, int maximo) {
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = aleatorio.nextInt(anchuraIntervalo) + minimo; //entero entre 100 y 0
			}
		}
	}
	
	
	public static void escribirMatriz(int[][] matriz) {
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.print("[");
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				System.out.printf("%3d", matriz[fila][columna]);
				if (columna != matriz[fila].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
	}	
	

	public static void main(String[] args) {
		final int NUMERO_FILAS = 8;
		final int NUMERO_COLUMNAS = 8;
		final int maximo = 100;
		final int minimo = 1;
		int[][] matriz = new int[NUMERO_FILAS][NUMERO_COLUMNAS];
		
		
		rellenar(matriz, minimo, maximo);
		System.out.println("\nMATRIZ:");
		escribirMatriz(matriz);
		
		int suma;
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			suma = 0;
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				suma = suma + matriz[fila][columna];
			}
			System.out.println("Suma de Columna " + fila + ": " + suma);
		}
		for (int columna = 0 ; columna < matriz[0].length ; columna++) {
			suma = 0;
			for (int fila = 0 ; fila < matriz.length ; fila++) {
				suma = suma + matriz[fila][columna];
			}
			System.out.println("Suma de Columna " + columna + ": " + suma);
		}
	}
}
