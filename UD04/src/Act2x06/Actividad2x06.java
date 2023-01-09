package Act2x06;
import entrada.Teclado;

public class Actividad2x06 {

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
		String frase = leerFrase("¿Frase? = ", 5, 40);
		for (int linea = 0 ; linea < frase.length() ; linea++) {
			for (int posicion = 0 ; posicion < linea ; posicion++) {
				System.out.print(frase.charAt(posicion));
			}
			System.out.println("");
		}
	}
}
