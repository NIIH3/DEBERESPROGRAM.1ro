package ejemplosUD4;
import entrada.Teclado;

public class EjemploMayus {

	public static void main(String[] args) {
		int i;
		char caracter;
		String cadena;
		String cadenaMayusculas = "";
		cadena = Teclado.leerCadena("Introduce cadena; ");
		for(i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);
			if(caracter >= 'a' && caracter <= 'z') {
				caracter = (char)(caracter - 32);
			}
			else if (caracter == 'ñ') {
				caracter = 'Ñ';
			}
			cadenaMayusculas = cadenaMayusculas + caracter;
		}
		System.out.println(cadenaMayusculas);
	}

}
