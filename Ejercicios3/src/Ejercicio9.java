import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame 3 números reales para sacar máximo y mínimo.");
		System.out.printf("Número A: ");
		num1 = teclado.nextDouble();
		
		System.out.printf("Número B: ");
		num2 = teclado.nextDouble();
		
		System.out.printf("Número C: ");
		num3 = teclado.nextDouble();
		//-   1 es el minimo 
		if (num1 < num2 && num1 < num3) {
			System.out.println("Mínimo: "+ num1);
		}
		//-   1 es el máximo
		else if (num1 > num2 && num1 > num3) { 
			System.out.println("Máximo: "+ num1);
		}
		
		if (num2 < num1 && num2 < num3) {
			System.out.println("Mínimo: "+ num2);
		}
		else if (num2 > num1 && num2 > num3) { 
			System.out.println("Máximo: "+ num2);
		}
		
		if (num3 < num2 && num3 > num1) {
			System.out.println("Mínimo: "+ num3);
		}
		else if (num3 > num2 && num3 > num1) { 
			System.out.println("Máximo: "+ num3);
		}
	}

}
