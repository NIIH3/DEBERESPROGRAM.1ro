package CatalogoVideosNetflix;


public class Catalogo {

	private Video[] videos;
	private int indice;
	
	
	public Catalogo(int capacidad) {
		this.videos = new Video[capacidad];
		this.indice = 0;
	}
	
	public boolean insertar(Video video) {
		if (indice < videos.length) {
			videos[indice] = video;
			indice++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String cadena = "";
		for (int pos = 0 ; pos < indice ; pos++) {
			Video video = videos[pos];
			cadena = cadena + "(" + pos + ")" + video.toString() + "\n";
		}
		return cadena;
	}
	
	public boolean eliminar(int pos) {
		boolean eliminado = false;
		if (pos < indice && pos >= 0) {
			while (pos < indice) {
				videos[pos] = videos[pos+1];
				pos++;
			}
			videos[pos] = null;
			indice--;
			eliminado = true;
		}
		return eliminado;
	}


	
	
}
