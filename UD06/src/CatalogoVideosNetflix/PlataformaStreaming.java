package CatalogoVideosNetflix;

import entrada.Teclado;

public class PlataformaStreaming {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa");
		System.out.println("(1) Insertar una Película");
		System.out.println("(2) Insertar una Serie");
		System.out.println("(3) Consultar todos los videos");
		System.out.println("(4) Consultar las Películas de un director");
		System.out.println("(5) Consultar las Series por año de inicio de emisión");
		System.out.println("(6) Eliminar un vídeo por código");
		System.out.println("(7) Reorganizar el catalogo para que primero aparezcan Películas, luego Series");
	}
	
	public static void main(String[] args) {
		int opcion, codigo, annoEstreno, annoEmision, annoFinal, numTemp, numCap, pos;
		String titulo, director;
		Video video;
		Pelicula pelicula;
		Serie serie;
		Catalogo catalogo = new Catalogo(10);
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion? ");
			switch(opcion) {
			case 0:
				break;
			case 1:
				titulo = Teclado.leerCadena("¿Título? = ");
				annoEstreno = Teclado.leerEntero("¿Año de estreno? = ");
				director = Teclado.leerCadena("¿Nombre del director? = ");
				pelicula = new Pelicula(titulo, annoEstreno, director);
				if (catalogo.insertar(pelicula)) {
					System.out.println("----- La película ha sido insertada. -----");
				}
				else {
					System.out.println("----- La película no ha sido insertada. -----");
				}
				break;
			case 2:
				titulo = Teclado.leerCadena("¿Título? = ");
				annoEmision = Teclado.leerEntero("¿Año de inicio de emisión? = ");
				annoFinal = Teclado.leerEntero("¿Año de final de emisión? = ");
				numTemp = Teclado.leerEntero("¿Número de temporadas? = ");
				numCap = Teclado.leerEntero("¿Número de capítulos? = ");
				serie = new Serie(titulo, annoEmision, annoFinal, numTemp, numCap);
				if (catalogo.insertar(serie)) {
					System.out.println("----- La serie ha sido insertada. -----");
				}
				else {
					System.out.println("----- La serie no ha sido insertada. -----");
				}
				break;
			case 3:
				System.out.println(catalogo.toString());
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				pos = Teclado.leerEntero("¿Código? = ");
				if (catalogo.eliminar(pos)) {
					System.out.println("Se ha eliminado el vídeo");
				}
				break;
			case 7:
				break;
			}
			
		}
		while (opcion != 0);
		System.out.println("----- Se ha finalizado el Programa. -----");

	}

}
