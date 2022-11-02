import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Dame 2 números reales");
		num1 = teclado.nextDouble();
		num2 = teclado.nextDouble();

		if (num1 > num2) {
			System.out.printf("\nEl número mayor es:%5.1f ", num1);
		}
		else if (num1 == num2) {
			System.out.printf("\nAmbos números ("+ num1 + ") son iguales.");
		}
		else {
			System.out.printf("\nEl número mayor es:%5.1f ", num2);
		}
	}

}
