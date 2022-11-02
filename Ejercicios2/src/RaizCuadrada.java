import java.util.Scanner;

public class RaizCuadrada {

	public static void main(String[] args) {
		double num, cuadrado, raizCuadrada;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número entero: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0)
			System.out.printf("El número " +num +" es par.");
			
			else if (num == 0) {
				System.out.println("\nEste número es Neutro");
			}
			else {
				System.out.printf("El número " +num +" es impar.");
			}
		
		if (num >= 0) {
			cuadrado = num * num;
			raizCuadrada = Math.sqrt(num);
			
			System.out.println("\nCuadrado: " + cuadrado);
			System.out.println("Raiz Cuadrada: " + raizCuadrada);
			
			System.out.printf("Cuadrado de %5.1f\n" , num, cuadrado);
			System.out.printf("Raiz cuadrada de %5.1f = %f5.1\n", num, raizCuadrada);
		}
		

		if (num < 0) {
			System.out.printf("\nEl número %5f" +num +" es negativo. \nPara el Cuadrado y la Raíz ha de ser positivo.");
		}
		
	}
}
