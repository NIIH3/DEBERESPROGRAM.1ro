package Act2x07;
import entrada.Teclado;

public class Actividad2x07 {
	
	public static String leerFrase(String mensaje, int longitudMin, int longitudMax) {
		String frase = Teclado.leerCadena(mensaje);
		int longitud = frase.length();
		while (longitud > longitudMax || longitud < longitudMin) {
			System.out.println("La frase debe tener " + longitudMin + " carácteres como mínimo.");
			System.out.println("La frase debe tener " + longitudMax + " carácteres como máximo.");
			frase = Teclado.leerCadena(mensaje);
		}
		return frase;
	}

	
	public static void main(String[] args) {
		String frase = leerFrase("¿Frase? = ",2,40);
		System.out.println("Rotaciones a la derecha:\n");
		
		for (int rotacion = 0 ; rotacion < frase.length() ; rotacion++) {
			System.out.println(frase);
			char ultimoCaracter = frase.charAt(frase.length() - 1);
			String restoCaracteres = frase.substring(0, frase.length() - 1);
			frase = ultimoCaracter + restoCaracteres;
		}
		
		System.out.println("Rotaciones a la izquierda:\n");
		
		for (int rotacion = 0 ; rotacion < frase.length() ; rotacion++) {
			System.out.println(frase);
			char primerCaracter = frase.charAt(0);
			String restoCaracteres = frase.substring(1);
			frase = primerCaracter + restoCaracteres;
		}
	
	
	}
}

//Bemvignut al Hospitalet