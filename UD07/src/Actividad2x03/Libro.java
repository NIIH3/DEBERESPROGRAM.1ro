package Actividad2x03;

public class Libro implements Comparable<Libro>{

	
	private int ISBN;
	private String titulo;
	private String escritor;
	private int annoPubli;
	private int stock;
	private double precio;
	
	
	public Libro(int iSBN, String titulo, String escritor, int annoPubli, int stock, double precio) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.escritor = escritor;
		this.annoPubli = annoPubli;
		this.stock = stock;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro [ISBN = " + ISBN + "| Título = " + titulo + "| Escritor = " + escritor + "| Año de Publicación = " + annoPubli + "]"
				+ "\n[ Stock = " + stock + "| Precio = " + precio + "]";
	}


	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
