package Ejemplo2;

public class Album {
	
	//atributos
	private String nombre;
	private int annoPubli;
	private String genero;
	private String artista;
	
	public Album(String nombre, int annoPubli, String genero, String artista) {
		this.nombre = nombre;
		this.annoPubli = annoPubli;
		this.genero = genero;
		this.artista = artista;
	}
	
	@Override
	public String toString() {
		return "\n-------ALBUM-------"
				+ "\nNombre = " + nombre
				+ "\nAño de Publicacion = " + annoPubli
				+ "\nGénero = " + genero
				+ "\nArtista = " + artista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
}



