package CatalogoVideosNetflix;


public class Pelicula extends Video {
	
	private int annoEstreno;
	private String director;

	
	public Pelicula(String titulo, int annoEstreno, String director) {
		super(titulo);
		this.annoEstreno = annoEstreno;
		this.director = director;
	}


	@Override
	public String toString() {
		return "Película [Título = " + titulo + " | Año de estreno = " + annoEstreno + " | Director = " + director +  "]";
	}


	


}
