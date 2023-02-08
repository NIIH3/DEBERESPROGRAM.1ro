package CatalogoVideosNetflix;

public abstract class Video {
	
	private static int contador = 0;
	
	
	protected String titulo;
	protected int codigo;
	
	public Video(String titulo) {
		contador++;
		this.titulo = titulo;
		this.codigo = contador;
	}
	@Override
	public String toString() {
		return "Video [Título = " + titulo + "| Código = " + codigo + "]";
	}
	
	
	
	
}
