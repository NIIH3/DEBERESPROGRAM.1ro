package ej1x3Libro;
import entrada.Teclado;
public class Actividad_1x03 {
	
	//Escribe en consola el menu de opciones del programa main.
	public static void escribirMenuOpciones() {
		System.out.println();
		System.out.println(" (0)  Salir del programa.");
		System.out.println(" (1)  Crear un libro a partir de datos leídos por teclado.");
		System.out.println(" (2)  Visualizar en consola el libro.");
		System.out.println(" (3)  Modificar el título del libro.");
		System.out.println(" (4)  Modificar el número de ejemplares del libro.");
		System.out.println(" (5)  Modificar el precio del libro.");
		System.out.println(" (6)  Visualizar en consola el título del libro.");
		System.out.println(" (7)  Visualizar en consola el número de ejemplares del libro.");
		System.out.println(" (8)  Visualizar en consola el precio del libro.");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int opcion, numeroEjemplares;
		Libro libro = null;
		String titulo = null;
		double precio;
		
		do { escribirMenuOpciones();
			opcion = Teclado.leerEntero("Introduce una opcion (0 - 8): ");
			switch (opcion) {
				//Salir del programa
			case 0:
				break;
			
				//Crear libro
			case 1: 
				if (libro == null) {
					Teclado.leerCadena("Introduce título: ");
					numeroEjemplares = Teclado.leerEntero("Introduce número de ejemplares: ");
					precio = Teclado.leerReal("Introduce precio: ");
					libro = new Libro(titulo, numeroEjemplares, precio);
					System.out.println("Se ha creado un nuevo libro");
				}
				else {
					System.out.println("Ya existe un libro creado.");
				}
				
				break;
			
				//Visualizar libro
			case 2:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					System.out.println();
					
				}
				break;
			
				//Modificar titulo
			case 3:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
				titulo = Teclado.leerCadena("Introduce título: ");
				libro.setTitulo(titulo);
				System.out.println("Se ha modificado el título del libro.");
				break;
				}
			
				//Modificar ejemplares
			case 4:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					
				}
				break;
			
				//Modificar precio
			case 5:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					
				}
				break;
			
				//Visualizar titulo
			case 6:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					
				}
				break;
			
				//Visualizar ejemplares
			case 7:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					
				}
				break;
			
				//Visualizar precio
			case 8:
				if (libro == null) {
					System.out.println("Antes se ha de crear un libro.");
				}
				else {
					
				}
				break;
			

			
			default: System.out.println(">>>>>La opción debe estar comprendida entre 0 y 8<<<<<");
			}
		}
		while (opcion != 0);
		System.out.println(">> Programa finalizado <<");
			
		

	}

}
