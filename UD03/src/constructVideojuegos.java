import entrada.Teclado;	

public class constructVideojuegos {

	public static Videojuego leerVideojuego() {
		String nombre = Teclado.leerCadena("Título del juego: ");
		String desarrollador = Teclado.leerCadena("Desarrollador del juego: ");
		int año = Teclado.leerEntero("Año de publicación: ");
		int numJugadores = Teclado.leerEntero("Jugadores máximos por partida: ");
		
		Videojuego videojuego = new Videojuego(nombre, desarrollador, año, numJugadores);
		return videojuego;
	}
	public static void main(String[] args) {
		int contador = 1;
		
		while (contador <= 3) {
			System.out.println("Videojuego " + contador);
		
		Videojuego videojuego = leerVideojuego();
		System.out.println(videojuego.estadoVidjg());
		
		contador++;
		}
	}
}
