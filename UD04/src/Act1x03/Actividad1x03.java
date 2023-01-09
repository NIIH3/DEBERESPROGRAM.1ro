package Act1x03;
import entrada.Teclado;

public class Actividad1x03 {

	public static boolean esSignoDePuntuacion(char caracter) {
		if (caracter == '.' || caracter == ',' || caracter == ':' || caracter == ';' || caracter == '-' || caracter == '(' || caracter == ')'|| caracter == '¿' 
			|| caracter == '?' || caracter == '¡' || caracter == '!' || caracter == '"' || caracter == '[' || caracter == ']' || caracter == '{' || caracter == '}') {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("¿Caracter? = ");
		
		if (esSignoDePuntuacion(caracter)) {
			System.out.println("El caracter ("+caracter+") es un signo de puntuación.");
		}
		else {
			System.out.println("El caracter ("+caracter+") NO es un signo de puntuación.");
		}

	}

}
