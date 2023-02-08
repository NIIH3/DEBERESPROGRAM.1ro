package Act1x01;

public class Videojuego {
	
	//att de clase
	private static int contador = 0;
	
	//att
	private int codigo;
	private String titulo;
	private double precio;
	private int cantidad;
	
	public Videojuego(String titulo, double precio, int cantidad) {
		contador++;
		this.codigo = contador;
		this.titulo = titulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "[Título = " + titulo + " ||  Precio = " + precio + "€ || Cantidad = " + cantidad +"]" ;
	}
	
}
