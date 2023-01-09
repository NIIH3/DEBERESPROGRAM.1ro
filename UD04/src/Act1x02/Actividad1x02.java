package Act1x02;
import entrada.Teclado;

public class Actividad1x02 {

	public static boolean esLetraMayuscula(char caracter){
		if (caracter >= 'A' && caracter <= 'Z') {
			return true;
		}
		else if (caracter == 'Ñ') {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean esLetraMinuscula(char caracter){
		if ((caracter >= 'a' && caracter <= 'z') || caracter == 'ñ') {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("¿Carácter? = ");
		
		
		if (esLetraMayuscula(caracter)) {
			System.out.println("El caracter " + caracter + " es mayúscula.");
		}
		else if (esLetraMinuscula(caracter)) {
			System.out.println("El caracter " + caracter + " es minúscula.");
		}
		else {
			System.out.println("El caracter "+ caracter +" no es una letra.");
		}
	}

}
