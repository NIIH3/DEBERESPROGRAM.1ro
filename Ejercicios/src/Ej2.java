import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int numA, numB, numC;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Dame un número entero: ");
		numA = teclado.nextInt();
		System.out.printf("Dame otro número entero: ");
		numB = teclado.nextInt();
		System.out.printf("Otro número entero más: ");
		numC = teclado.nextInt();
		
		System.out.println("Tus números alineados a la derecha:");
		System.out.printf("%2d \n", numA);
		System.out.printf("%2d \n", numB);
		System.out.printf("%2d \n" , numC);
		
		
		
	}

}
