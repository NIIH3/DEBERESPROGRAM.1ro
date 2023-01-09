package Act2x08;

import entrada.Teclado;

public class Actividad2x08 {
	
	public static boolean hayVariosEspacios (char espacio) {
		boolean hayEspacios;
		if (espacio > 1) {
			hayEspacios = true;
		}
		else {
			hayEspacios = false;
		}
		return hayEspacios;
	}

	public static void main(String[] args) {
		char espacio = ' ';
		String frase = Teclado.leerCadena("¿Nombre completo? = ");
		char primerCaracter = frase.charAt(0);
		char ultimoCaracter = frase.charAt(frase.length() - 1);
		boolean hayEspacio = false;
		while (hayEspacio = true
				) {
			if (primerCaracter == espacio) {
				System.out.println("El primer carácter no puede estar en blanco.");
				hayEspacio = true;
			}
			if (ultimoCaracter == espacio) {
				System.out.println("El último carácter no puede estar en blanco.");
				hayEspacio = true;
			}
			if (hayVariosEspacios(ultimoCaracter)) {
				System.out.println("Solo puede haber un espacio en blanco.");
				hayEspacio = true;
			}
		}
		

	}

}
