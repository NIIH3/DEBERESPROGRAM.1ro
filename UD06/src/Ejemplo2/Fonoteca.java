package Ejemplo2;
import entrada.Teclado;

public class Fonoteca {
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Insertar un álbum en la colección.");
		System.out.println("(2) Consultar todos los álbumes.");
		System.out.println("(3) Eliminar un álbum de la colección.");
		System.out.println("(4) Consultar un álbum por posición");
		System.out.println("(5) Consultar un álbum por nombre.");
		System.out.println();
	}
	public static void main(String[] args) {
		Coleccion coleccion = new Coleccion(10);
		int opcion, annoPubli, pos;
		String nombre, genero, artista;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción (0 - 5)?");
			Album album;
			switch (opcion) {
			case 1:
				nombre = Teclado.leerCadena("¿Nombre? = ");
				artista = Teclado.leerCadena("¿Artista? = ");
				annoPubli = Teclado.leerEntero("¿Año de publicación? = ");
				genero = Teclado.leerCadena("¿Género? = ");
				album = new Album(nombre, annoPubli, artista, genero);
				if (coleccion.insertar(album)) {
					System.out.println("---------------------------------------");
					System.out.println("El álbum se ha insertado correctamente.");
					System.out.println("---------------------------------------");
				}
				else {
					System.out.println("------------------------");
					System.out.println("La colección está llena.");
					System.out.println("------------------------");
				}
				break;
				
				
			case 2:
				System.out.println(coleccion.toString());
				break;
				
				
			case 3:
				pos = Teclado.leerEntero("¿Posición? = ");
				if (coleccion.eliminar(pos)) {
				System.out.println("---------------------------------------");
				System.out.println("El álbum se ha eliminado correctamente.");
				System.out.println("---------------------------------------");
				}
				else {
				System.out.println("-------------------------------------------------------------");
				System.out.println("- ERROR -La colección está vacía o la posición es incorrecta.");
				System.out.println("-------------------------------------------------------------");
				}
				break;
				
			case 4:
				pos = Teclado.leerEntero("¿Posicion? = ");
				album = coleccion.consultar(pos);
				if (album == null) {
					System.out.println("-------------------------------------------------------------");
					System.out.println("- ERROR -La colección está vacía o la posición es incorrecta.");
					System.out.println("-------------------------------------------------------------");
				}
				else {
					System.out.println(album.toString());
					} 
				break;
				
			case 5:
				nombre = Teclado.leerCadena("¿Nombre? = ");
				album = coleccion.consultarNombre(nombre);
				if (album == null) {
					System.out.println("--------------------------------------");
					System.out.println("- ERROR - No se ha encontrado el album");
					System.out.println("--------------------------------------");
				}
				else {
					System.out.println("--------------------------------------");
					System.out.println(album.toString());
					System.out.println("--------------------------------------");
				}
				break;
				
			default:
				if (opcion >= 0 || opcion >= 5) {
					System.out.println();
				}
				else {
					System.out.println("---------------------------------------------");
					System.out.println("La opción debe estar comprendida entre 0 y 5.");
					System.out.println("---------------------------------------------");
				}
			}
		}
		while (opcion != 0);
		System.out.println("Programa finalizado.");

	}

}
