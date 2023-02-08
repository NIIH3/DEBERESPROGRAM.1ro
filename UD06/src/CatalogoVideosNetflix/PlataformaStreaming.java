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
		int opcion, codigo;
		String titulo;
		Video video;
		Pelicula pelicula;
		Serie serie;
		Catalogo catalogo = new Catalogo(10);
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion? ");
			
		}
		while (opcion != 0);
		System.out.println("Se ha finalizado el Programa.");

	}

}
