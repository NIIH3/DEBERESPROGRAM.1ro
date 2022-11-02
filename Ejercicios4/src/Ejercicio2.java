import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero real?");
		int num;
		num = teclado.nextInt();
		
		do {
			System.out.println("Número real?(entre 0 y 5 para salir)");
			num = teclado.nextInt();
		}
		while ( num>5 || num<0 );
		System.out.println("Fin del programa");
		
	}

}
