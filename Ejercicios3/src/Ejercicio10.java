import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame 3 números reales para poner en orden");
		System.out.printf("Número 1: ");
		num1 = teclado.nextDouble();
		
		System.out.printf("Número 2: ");
		num2 = teclado.nextDouble();
		
		System.out.printf("Número 3: ");
		num3 = teclado.nextDouble();
		 
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + "<" + num2 + "<" +num3);
		}
		else if (num1 > num2 && num1 > num3) { 
			System.out.println(num2 + "<" + num3 + "<" +num1);
		}
		else if (num1 > num2 && num1 < num3) { 
			System.out.println(num2 + "<" + num1 + "<" +num3);
		}
		else if (num1 < num2 && num1 > num3) { 
			System.out.println(num1 + "<" + num3 + "<" +num2);
		}
		
		
		else if (num2 < num3 && num2 < num1) {
			System.out.println(num2 + "<" + num1 + "<" +num3);
		}
		else if (num2 > num3 && num2 > num1) { 
			System.out.println(num1 + "<" + num3 + "<" +num2);
		}
		else if (num2 > num3 && num2 < num1) { 
			System.out.println(num3 + "<" + num2 + "<" +num1);
		}
		else if (num2 < num3 && num2 > num1) { 
			System.out.println(num2 + "<" + num1 + "<" +num3);
		}
		
		
		else if (num3 < num2 && num3 < num1) {
			System.out.println(num3 + "<" + num2 + "<" +num1);
		}
		else if (num3 > num2 && num3 > num1) { 
			System.out.println(num1 + "<" + num2 + "<" +num3);
		}
		else if (num3 > num2 && num3 < num1) { 
			System.out.println(num2 + "<" + num3 + "<" +num1);
		}
		else if (num3 < num2 && num3 > num1) { 
			System.out.println(num3 + "<" + num1 + "<" +num2);
		}
		//        -ESTA MAL, ARREGLAR-																																							jooooooder
	}
}