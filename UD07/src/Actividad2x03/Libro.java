package Actividad2x03;

public class Libro implements Comparable<Libro>{

	
	private String isbn;
	private String titulo;
	private String escritor;
	private int annoPubli;
	private int stock;
	private double precio;
	
	
	public Libro(String isbn, String titulo, String escritor, int annoPubli, int stock, double precio) {
		super();
		isbn = isbn;
		this.titulo = titulo;
		this.escritor = escritor;
		this.annoPubli = annoPubli;
		this.stock = stock;
		this.precio = precio;
	}


	public Libro(String isbn2) {
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Libro [ISBN = " + isbn + "| Título = " + titulo + "| Escritor = " + escritor + "| Año de Publicación = " + annoPubli + "]"
				+ "\n[ Stock = " + stock + "| Precio = " + precio + "]";
	}


	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
