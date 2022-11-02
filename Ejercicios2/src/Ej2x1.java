import java.util.Scanner;

public class Ej2x1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		
		System.out.println("Dame un número par del 0 al 30");
		dato = teclado.nextInt();
		
		if (dato%2 ==0) {
			System.out.println("Muy amable, gracias ;)");
		}
		
		else if (dato == 5) {
			System.out.println("Por e c*lo te la hinco");
		}
		
		else if (dato == 25) {
			System.out.println("Por e c*lo te la hinco");
		}
		else {
			System.out.println("He dicho par, mongolo. El número " + dato + " es impar." );
		}
		 if (dato > 30) {
			System.out.println("DEL 0 AL 30 BOBO");
		}
		else if (dato < 0) {
			System.out.println("DEL 0 AL 30 BOBO");
		}
	}

}
