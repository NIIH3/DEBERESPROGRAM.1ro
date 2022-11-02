import java.util.Scanner;
public class Ejercicio14PROFE {

	public static void main(String[] args) {
		final int NUMEROSECRETO = 19;
		final int NUMEROINTENTOS = 5;
		int contador = 0, numero;
		boolean acierto = false;
		Scanner teclado = new Scanner(System.in);
		
		while (contador < NUMEROINTENTOS && !acierto) {
			System.out.print("¿Numero?: ");
			numero = teclado.nextInt();
			
			if (numero == NUMEROSECRETO) {
				System.out.println("Has acertado el número secreto.");
				acierto = true;
			}
			else {
				System.out.println("Has fallado");
				if (numero < NUMEROSECRETO) {
					System.out.println("El número" +numero + "es menor que el numero secreto.");
				}
				else {System.out.println("El número " + numero + "es mayor que el número secreto");
				}
			}
			contador = contador +1;
		}
		if (contador == NUMEROINTENTOS && acierto == false) {
			System.out.println("Has agotado los " + NUMEROINTENTOS + " intentos.");
		}
		
	}

}
