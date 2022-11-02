import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dato;
		
		System.out.println("Dame un número gracioso");
		dato = teclado.nextInt();
		
		if(dato == 5) {
		System.out.println("Por el c**o te la hinco");
		}
		else {
			System.out.println("Pues nada, tenga buen dia");
		}
	}

}
