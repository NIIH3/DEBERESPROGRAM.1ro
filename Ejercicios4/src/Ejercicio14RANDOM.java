import java.util.Scanner;
public class Ejercicio14RANDOM {

	public static void main(String[] args) {
		int NUMEROSECRETO = (int)(Math. random()*100+1);
		final int NUMEROINTENTOS = 10;
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
					System.out.println("El número " +numero + " es menor que el numero secreto.");
				}
				else {System.out.println("El número " + numero + " es mayor que el número secreto");
				}
			}
			contador = contador +1;
		}
		if (contador == NUMEROINTENTOS && acierto == false) {
			System.out.println("Has agotado los " + NUMEROINTENTOS + " intentos.");
			System.out.println("El número secreto era: >" + NUMEROSECRETO);
		}
		
	}

}
