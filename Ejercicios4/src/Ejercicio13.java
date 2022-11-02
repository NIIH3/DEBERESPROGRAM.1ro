import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		int num, contador = 0, contador0 =0, contadorP = 0, contadorN = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Numero entero 0:");
		num = teclado.nextInt();
		if (num == 0) {
			contador0 = contador0 + 1;
		}
		if (num > 0) {
			contadorP = contadorP + 1;
		}
		else if (num < 0) {
			contadorN = contadorN + 1;
		}
		contador = contador +1;
		while (contador != 10) {
			System.out.printf("Número entero " + contador + "?");
			num = teclado.nextInt();
			
			if (num == 0) {
				contador0 = contador0 + 1;
			}
			if (num > 0) {
				contadorP = contadorP + 1;
			}
			else if (num < 0) {
				contadorN = contadorN + 1;
			}
			contador = contador +1;
		}
		System.out.println("Cantidad de 0s: " + contador0);
		System.out.println("Numeros positivos: " + contadorP);
		System.out.println("Numeros negativos: " + contadorN);

	}

}
