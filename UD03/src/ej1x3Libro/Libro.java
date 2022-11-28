package ej1x3Libro;

public class Libro {
	private String titulo;
	private int numeroEjemplares;
	private double precio;
	
	public Libro(String titulo, int numeroEjemplares, double precio) {
		this.titulo = titulo;
		this.numeroEjemplares = numeroEjemplares;
		this.precio = precio;
	}
	
	public String obtenerEstado() {
		return "Libro\n[Título = " + titulo + ", Numero de ejemplares = " + numeroEjemplares + ", Precio = " + precio + "]";
	}
	
	//Devuelve el título
	public String getTitulo() {
		return titulo;
	}
	//Modifica el título
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
