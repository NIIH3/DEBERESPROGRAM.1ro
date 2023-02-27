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
		System.out.println("------ M I S C E L Á N E O S ------");
		System.out.println("(10) Crear la ciudad de Zaragoza sin librerías");
		System.out.println("(11) Añadir la Librería que se esté gestionando en el menú, a la ciudad de Zaragoza");
		System.out.println("(12) Consultar los libros de todas las librerías de la ciudad de Zaragoza");
		System.out.println("(13) Consultar los nombres de las librerías de Zaragoza en las que se vende un libro determinado");	
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Libro> lista = new ArrayList<>();
		int opcion, ISBN, annoPubli, stock;
		double precio;
		String titulo, escritor;
		Libro libro;
		
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("¿Opcion? ");
			
			switch(opcion) {
			case 0:
				break;
				
			case 1:
				break;
				
			case 2:
			ISBN = Teclado.leerEntero("¿DNI? = ");
			libro  = new Libro (ISBN, "", "", 0, 0, 0);
			if (lista.contains(libro)) {
				System.out.println("Ya existe un librp con ese ISBN en la lista.");
			}
			else {
				titulo = Teclado.leerCadena("¿Título? = ");
				escritor = Teclado.leerCadena("¿Nombre del Escritor/a? = ");
				annoPubli = Teclado.leerEntero("¿Año de publicación? = ");
				stock = Teclado.leerEntero("¿Stock? = ");
				precio = Teclado.leerEntero("¿Precio? = ");
				libro = new Libro(ISBN, titulo, escritor, annoPubli, stock, precio);
				if (lista.add(libro)) {
					System.out.println("Se ha insertado una Persona en la lista.");
				}
			}
				break;
				
			case 3:
				ISBN = Teclado.leerEntero("¿ISBN? = ");
				libro  = new Libro (ISBN, "", "", 0, 0, 0);
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
				break;
				
			case 6:
				break;
				
			case 7:
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
