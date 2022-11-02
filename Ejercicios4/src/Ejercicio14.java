import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		int numero, contador;
		Scanner teclado = new Scanner(System.in);

		contador = 1;
		System.out.println("-Adivina el numerito secreto, tienes 5 intentos-");
		System.out.printf("Adelante: ");
		numero = teclado.nextInt();


		if (numero == 19) {
			System.out.println("-Olé, a la primera");
		}

		while (numero != 19 && contador != 5) {
			if (numero > 19) {
				System.out.println("-El número es menor que " + numero + ".");
			}

			else if (numero < 19) {
				System.out.println("-El número es mayor que " + numero + ".");
			}
			System.out.println("Prueba de nuevo: ");
			contador = contador +1;
			numero = teclado.nextInt();

			if (numero == 19) {
				contador = contador -1;
				System.out.println("-De maravilla, has acertado.");
			}
			if (contador == 5) {
				System.out.println("-Game over.");
			}
		}

	}

}
