package Act1x01;
import entrada.Teclado;

public class Tienda {
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Insertar un videojuego en el almacén.");
		System.out.println("(2) Eliminar un videojuego, por posición, del almacén.");
		System.out.println("(3) Consultar un videojuego, por posición, del almacén.");
		System.out.println("(4) Consultar todos los videojuegos del almacén");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Almacen almacen = new Almacen(10);
		int opcion, pos, cantidad;
		double precio;
		String titulo;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción (1 - 4)? ");
			Videojuego videojuego;
			switch (opcion) {
			case 1:
				titulo = Teclado.leerCadena("Título = ");
				precio = Teclado.leerReal("Precio = ");
				cantidad = Teclado.leerEntero("Cantidad = ");
				videojuego = new Videojuego(titulo, precio, cantidad);
				if (almacen.insertar(videojuego)) {
					System.out.println("--------------------------------------------");
					System.out.println("El Videojuego se ha insertado correctamente.");
					System.out.println("--------------------------------------------");
				}
				else {
					System.out.println("----------------------");
					System.out.println("El almacén está lleno.");
					System.out.println("----------------------");
				}
				break;
				
			case 2:
				pos = Teclado.leerEntero("¿Posición? = ");
				if (almacen.eliminar(pos)) {
				System.out.println("--------------------------------------------");
				System.out.println("El Videojuego se ha eliminado correctamente.");
				System.out.println("--------------------------------------------");
				}
				else {
				System.out.println("------------------------------------------------------------");
				System.out.println("- ERROR - El almacén está vacío o la posición es incorrecta.");
				System.out.println("------------------------------------------------------------");
				}
				break;
				
			case 3:
				pos = Teclado.leerEntero("¿Posicion? = ");
				videojuego = almacen.consultar(pos);
				if (videojuego == null) {
					System.out.println("------------------------------------------------------------");
					System.out.println("- ERROR - El almacén está vacío o la posición es incorrecta.");
					System.out.println("------------------------------------------------------------");
				}
				else {
					System.out.println(videojuego.toString());
				} 
			break;
				
			case 4:
				System.out.println(almacen.toString());
				break;
				
			default:
				if (opcion == 0 || opcion == 0 && opcion <= 4) {
					System.out.println();
				}
				else {
					System.out.println("---------------------------------------------");
					System.out.println("La opción debe estar comprendida entre 0 y 4.");
					System.out.println("---------------------------------------------");
				}
			}
			
		}
		while (opcion != 0);
			System.out.println("--------------------");
			System.out.println("PROGRAMA FINALIZADO.");
			System.out.println("--------------------");

	}

}
