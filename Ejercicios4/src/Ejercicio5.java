import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		int contador = 0;
		int numero;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(contador < TOTAL_NUMEROS) {
			System.out.print("Número entero " + contador + "? ");
			numero = teclado.nextInt();
			suma = suma + numero;
			contador = contador +1;	
		}
		System.out.println("Suma: " +suma);
	}

}
