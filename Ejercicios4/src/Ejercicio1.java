import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe un número");
		
		num1 = teclado.nextInt();
		
		while ( num1 != 0 ) {
			System.out.println("Escriba otro número (0 para salir)");
			num1 = teclado.nextInt();
			
		}
		System.out.println("Fin del programa");
	
	}

}
