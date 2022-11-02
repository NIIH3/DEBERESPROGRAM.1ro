import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int numero;
		int suma = 0;
		int contador = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Escribe un número entero (o introduce 0 para salir): ");
		numero = teclado.nextInt();
	
		while (numero != 0) {
			System.out.printf("Otro número (o 0): ");
			numero = teclado.nextInt();
			contador = contador +1;
			suma = suma +numero;
		}
		if (contador == 0) {
			System.out.println("No hay media.");
		}
		else {
		media = suma + contador;
		System.out.println("La media de todos ellos es: " + media);
		}
	}	

}
