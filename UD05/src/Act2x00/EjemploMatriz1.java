package Act2x00;

import java.util.Random;
import java.util.Arrays;

public class EjemploMatriz1 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int[][] matriz = new int[3][4];
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			//Al ser irregluar se saca el tamaño
			for (int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = aleatorio.nextInt(11) + 10; //entero entre 10 y 11
			}
		}
		
		System.out.println("MATRIZ:");
		for (int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.println(Arrays.toString(matriz[fila]));
		}
		
	}

}
