package Act1x01;
import entrada.Teclado;

public class Actividad1x01 {
	
	public static boolean esNumeroArabigo(char caracter) {
		if (caracter >= '0' && caracter <= '9') {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("¿Carácter? = ");
		if (esNumeroArabigo(caracter)) {
			System.out.println("El carácter " + caracter + " es un número arábigo.");
		}
		else {
			System.out.println("El carácter " + caracter + " NO es un número arábigo.");
		}
		
	}

}
