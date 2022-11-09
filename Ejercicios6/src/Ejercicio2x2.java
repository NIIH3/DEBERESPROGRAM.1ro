import java.util.Scanner;
public class Ejercicio2x2 {

	public static void dibujarRectangulo(int altura,int  anchura) {
		int a, b;
		for (a = 1 ; a <= altura ; a++) {
			for (b = 1 ; b <= anchura ; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void main(String[]args) {
		int altura, anchura, salida, respuesta;
		boolean dimensionesValidas;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("¿Altura del rectangulo?: ");
			altura = teclado.nextInt();
			System.out.println("¿Anchura del rectangulo?: ");
			anchura = teclado.nextInt();
			
			dimensionesValidas = true;
			if (altura <= 0) {
				System.out.println("La altura del rectágulo debe ser positiva.");
				dimensionesValidas = false;
			}
			if (anchura <= 0) {
				System.out.println("La anchura del rectágulo debe ser positiva.");
				dimensionesValidas = false;
			}
			if (dimensionesValidas) {
				dibujarRectangulo(altura, anchura);
			}
			
			System.out.println("¿Quieres procesar otro rectángulo?");
			respuesta = teclado.nextInt();
			System.out.println();
		}
		while (respuesta > 0);	
	}
}
