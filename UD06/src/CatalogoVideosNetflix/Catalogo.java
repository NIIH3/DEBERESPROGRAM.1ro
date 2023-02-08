package CatalogoVideosNetflix;

public class Catalogo {

	private Video[] videos;
	private int indice;
	
	
	public Catalogo(int capacidad) {
		this.videos = new Video[capacidad];
		this.indice = 0;
	}
	
	
}
