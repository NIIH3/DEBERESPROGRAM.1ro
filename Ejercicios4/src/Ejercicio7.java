import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		int numero, contador, minimo, maximo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("¿Numero entero 1?: ");
		numero = teclado.nextInt();
		
		contador = 1;
		minimo = numero;
		maximo = numero;
		
		while (contador < TOTAL_NUMEROS) {
			System.out.printf("¿Número entero " + (contador+1) +"? ");
			numero = teclado.nextInt();
			
			contador++;
			if (numero < minimo) {
				minimo = numero;
			}
			if (numero > maximo) {
				maximo = numero;
			}
		}
		
		System.out.println("Numero mínimo: " + minimo);
		System.out.println("Numero máximo: " + maximo);
	}

}
