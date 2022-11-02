import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		boolean salida;
		Scanner teclado = new Scanner(System.in);
		
		salida = false;
		
		System.out.println("Numero para sacar divisores (Escribe 0 para salir): ");
		num = teclado.nextInt();
		if (num == 0) {
			salida = true;
			System.out.println("- Has salido del programa -");
		}
		else {
		System.out.println("Divisores del número " + num + ":");
		System.out.println( ContadorDivisores(num));
		System.out.println("divisores.");
		
		}
	}
	public static int ContadorDivisores(int num) {
		int numeroDivisores = 0;
		int divisor;
		for (divisor = 1 ; divisor <= num ; divisor++) {
			if (num % divisor == 0) {
				System.out.print(divisor + " ");
				numeroDivisores++;
			}
		}
		System.out.println("\nEl número " + num + " tiene: ");
		return numeroDivisores;
	}

}
