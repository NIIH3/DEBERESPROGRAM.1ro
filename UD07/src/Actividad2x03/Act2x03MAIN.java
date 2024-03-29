package Actividad2x03;

import java.util.ArrayList;
import java.util.List;

import ListaObjetos.Persona;
import entrada.Teclado;

public class Act2x03MAIN {
	
	public static void escribirLista(List<Libro> lista) {
		for (Libro o : lista) {
			System.out.println(o.toString());
		}
		System.out.println(lista.size() + " libros consultados");
	}

	public static void escribirMenuOpciones() {
		System.out.println();
		System.out.println("(0) Salir del Programa");
		System.out.println("(1) Crear una nueva Librería");
		System.out.println("(2) Insertar un Libro en la Librería");
		System.out.println("(3) Eliminar un libro de la Librería por ISBN");
		System.out.println("(4) Consultar un libro, por ISBN, de la librería");
		System.out.println("(5) Consultar todos los libros de la librería");
		System.out.println("(6) Consultar varios libros, por escritor, de la librería");
		System.out.println("(7) Consultar el libro de mayor precio de la librería");
		System.out.println("(8) Gestionar la venta de una unidad de un determinado libro por ISBN");
		System.out.println();
		System.out.println("- - - - - - - -   M I S C E L Á N E O S   - - - - - - - -");
		System.out.println("(10) Crear la ciudad de Zaragoza sin librerías");
		System.out.println("(11) Añadir la Librería que se esté gestionando en el menú, a la ciudad de Zaragoza");
		System.out.println("(12) Consultar los libros de todas las librerías de la ciudad de Zaragoza");
		System.out.println("(13) Consultar los nombres de las librerías de Zaragoza en las que se vende un libro determinado");	
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Libro> lista = new ArrayList<>();
		List<Libro> listaAux;
		int opcion, annoPubli, stock;
		double precio;
		String titulo, nombre, escritor, isbn;
		Libro libro;
		boolean encontrado = false;
		
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("¿Opcion? ");
			Libreria libreria = null;
			
			switch(opcion) {
			case 0:
				break;
				
			case 1:
				nombre = Teclado.leerCadena("¿Nombre? = ");
				libreria = new Libreria(nombre);
				System.out.println("Se ha creado una nueva librería");
				break;
				
			case 2:
				isbn = Teclado.leerCadena("¿ISBN? = ");
				for (int i = 0 ; i < lista.size() ; i++) {
					Libro lib = lista.get(i);
					if (lib.getIsbn().equals(isbn)) {
						encontrado = true;
					}
				}
				if (encontrado) {
					System.out.println("Ya existe un libro con ese ISBN");
				}
				titulo = Teclado.leerCadena("¿Título? = ");
				escritor = Teclado.leerCadena("¿Nombre del Escritor/a? = ");
				annoPubli = Teclado.leerEntero("¿Año de publicación? = ");
				stock = Teclado.leerEntero("¿Stock? = ");
				precio = Teclado.leerEntero("¿Precio? = ");
				libro = new Libro(isbn, titulo, escritor, annoPubli, stock, precio);
				break;
				
			case 3:
				isbn = Teclado.leerCadena("¿ISBN? = ");
				libro  = new Libro (isbn, "", "", 0, 0, 0);
				if (lista.remove(libro)) {
					System.out.println("Se ha eliminado un libro de la lista.");
				}
				else {
					System.out.println("No se ha encontrado ningun libro con ese ISBN");
				}
				break;	
				
			case 4:
				break;
				
			case 5:
				if (libreria == null) {
					System.out.println("Antes debes crear una libreria");
				}
				else {
					System.out.println(libreria.toString());
				}
				break;
				
			case 6:
				break;
				
			case 7:
				if (libreria == null) {
					System.out.println("Antes se ha de crear una librería.");
				}
				else {
					escritor = Teclado.leerCadena("¿Escritor? = ");
					listaAux = libreria.consultarPorEscritor(escritor);
					
				}
				break;
				
			case 8:
				break;
				
				
				
			}
		}
		while (opcion != 0);
		System.out.println("");
		System.out.println(">>>>> PROGRAMA FINALIZADO <<<<<");
	}

}
