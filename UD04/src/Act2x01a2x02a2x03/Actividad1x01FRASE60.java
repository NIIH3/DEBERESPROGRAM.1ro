package Act2x01a2x02a2x03;
import entrada.Teclado;

public class Actividad1x01FRASE60 {

	public static String leerFrase (String string, int longitudMaxima) {
		String frase = Teclado.leerCadena(string);
		while (frase.length() > longitudMaxima) {
			System.out.println("La frase debe tener " + longitudMaxima + " caracteres como máximo.");
			frase = Teclado.leerCadena(string);
		}
		return frase;
	}
	
	public static void main(String[] args) {
		int mensaje, longitudMaxima;
		String frase = leerFrase("¿Frase? = ", 60);
		int contadorLetrasMayusculas = 0;
		String letrasMayusculas = "";
		int contadorLetrasMinusculas = 0;
		String letrasMinusculas = "";
		int contadorPuntuacion = 0;
		
		
		String signosPuntuacion = "";
		
		
		
		final String LETRAS_VOCALES_PERMITIDAS = "AEIOUaeiou"; 
				String letrasVocales = "";
				int contadorVocales = 0;
				String letrasConsonantes = "";
				int contadorConsonantes = 0;
				for (int posicion = 0 ; posicion < frase.length() ; posicion++) {
					char caracter = frase.charAt(posicion);
					if((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z')) {
						if(LETRAS_VOCALES_PERMITIDAS.indexOf(caracter) >= 0) {
							contadorVocales++;
							letrasVocales = letrasVocales + caracter;
						}
					}
					else {
							contadorConsonantes++;
							letrasConsonantes = letrasConsonantes + caracter;
						}
				}
		
		
		
		
		
		for (int posicion = 0 ; posicion < frase.length() ; posicion++) {
			char caracter = frase.charAt(posicion);
			if (caracter >= 'A' && caracter <= 'Z' || caracter == 'Ñ') {
				contadorLetrasMayusculas++;
				letrasMayusculas = letrasMayusculas + caracter;
			}
			else if ((caracter >= 'a' && caracter <= 'z') || caracter == 'ñ') {
				contadorLetrasMinusculas++;
				letrasMinusculas = letrasMinusculas + caracter;
			}
			else if (caracter == '.' || caracter == ',' || caracter == ':' || caracter == ';' || caracter == '-' || caracter == '(' || caracter == ')'|| caracter == '¿' 
					|| caracter == '?' || caracter == '¡' || caracter == '!' || caracter == '"' || caracter == '[' || caracter == ']' || caracter == '{' || caracter == '}') {
				contadorPuntuacion++;
				signosPuntuacion = signosPuntuacion + caracter;
			}
		}
		System.out.println("La frase tiene " + contadorLetrasMayusculas + " letras mayúsculas.");
		System.out.println("Letras mayúsculas: " + letrasMayusculas);
		System.out.println("------------------------------------------------------------------");
		System.out.println("La frase tiene " + contadorLetrasMinusculas + " letras minúsculas.");
		System.out.println("Letras minúsculas: " + letrasMinusculas);
		System.out.println("------------------------------------------------------------------");
		System.out.println("La frase tiene " + contadorVocales + " letras vocales.");
		System.out.println("Letras vocales: " + letrasVocales);
		System.out.println("------------------------------------------------------------------");
		System.out.println("La frase tiene " + contadorConsonantes + " letras consonantes.");
		System.out.println("Letras consonantes: " + letrasConsonantes);
		System.out.println("------------------------------------------------------------------");
		System.out.println("La frase tiene " + contadorPuntuacion + " signos de puntuación.");
		System.out.println("Signos de puntuación: " + signosPuntuacion);

	}

}
