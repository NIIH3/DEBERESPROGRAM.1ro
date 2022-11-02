import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		boolean valido;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número entero comprendido entre 0 y 99999");
		num = teclado.nextInt();
		
		if (num >= 0 && num <= 99999) {
			System.out.printf("El número es válido");
			valido = true;
		}
		else if (num < 10) {
			System.out.println("El número tine 1 cifra");
		
		}
		else if (num < 100) {
			System.out.println("El número tine 2 cifras");
		
		}
		else if (num < 1000) {
			System.out.println("El número tine 3 cifras");
		
		}
		else if (num < 10000) {
			System.out.println("El número tine 4 cifras");
		
		}
		else if (num < 100000) {
			System.out.println("El número tine 5 cifras");
		}

		else {
			System.out.println("El número ha de estar entre 0 y 99999");
		}
	}

}
