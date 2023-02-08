package CatalogoVideosNetflix;

public abstract class Serie extends Video {

	private int annoEmision;
	private int annoFinal;
	private int numTemp;
	private int numCap;
	
	
	public Serie(String titulo, int annoEmision, int annoFinal, int numTemp, int numCap) {
		super(titulo);
		this.annoEmision = annoEmision;
		this.annoFinal = annoFinal;
		this.numTemp = numTemp;
		this.numCap = numCap;
	}


	@Override
	public String toString() {
		return "Serie [ Titulo =" + titulo + "| Código=" + codigo + "| Año de emisión = " + annoEmision + "| Año de fin de emisión = " + annoFinal 
				+ "| Temporadas = " + numTemp + "| Capítulos = " + numCap + "]";
	}






	
	
	
	
	
}
