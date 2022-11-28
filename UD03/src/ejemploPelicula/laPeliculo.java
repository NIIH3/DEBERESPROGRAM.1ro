package ejemploPelicula;
import entrada.Teclado;

public class laPeliculo {
	
	//Lee una película por teclado
	public static EjemploPelicula leerPelicula() {
	String nombre = Teclado.leerCadena("Introduce un nombre: ");
	int duracion = Teclado.leerNatural("Introduce la duracion: ");
	boolean dobladaCastellano = Teclado.leerBooleano("¿Esta doblada al castellano?: ");
	double puntuacion = Teclado.leerReal("Introduce la puntuacion: ");
	
	EjemploPelicula pelicula = new EjemploPelicula(nombre, duracion, dobladaCastellano, puntuacion);
	
	return pelicula;
	}
	
	public static void main(String[] args) {
		
		

		
//		EjemploPelicula pelicula1 = new EjemploPelicula(null, 0, false, 0);
//		System.out.println(pelicula1.getNombre());
//		System.out.println(pelicula1.getDuracion());
//		System.out.println(pelicula1.getDobladaCastellano());
//		System.out.println(pelicula1.getPuntuacion());
		
		
//		pelicula1.setNombre("ESDLA: El Retorno del Rey");
//		pelicula1.setDuracion(205);
//		pelicula1.setDobladoCastellano(true);
//		pelicula1.setPuntuacion(9.7); 
		
		EjemploPelicula peli = leerPelicula();
		
//		EjemploPelicula pelicula2 = new EjemploPelicula(nombre, duracion, dobladaCastellano, puntuacion);
//		pelicula2.setNombre("Titanic");
//		pelicula2.setDuracion(180);
//		pelicula2.setDobladoCastellano(true);
//		pelicula2.setPuntuacion(8.2); 
		
		
		System.out.println(peli.obtenerEstado());
		
		
		
		
	}
}
