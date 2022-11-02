import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		int altura, anchura;
		int a, b;
		boolean dimensionValida;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Altura del rectángulo: ");
		altura = teclado.nextInt();
		System.out.printf("Anchura del rectángulo: ");
		anchura = teclado.nextInt();
		
		dimensionValida = true;
		if (altura <= 0 ) {
			System.out.println("La altura debe ser positiva.");
			dimensionValida = false;
		}
		if (anchura <= 0 ) {
			System.out.println("La anchura debe ser positiva.");
			dimensionValida = false;
		}
		
		if (dimensionValida) {
			//cada línea
			for ( a = 1 ; a <= altura ; a++) {
				//cada columna
				for ( b = 1 ; b <= anchura ; b++) {
					System.out.print('E');
				}
				System.out.println();
			}
		}
		

	}

}
