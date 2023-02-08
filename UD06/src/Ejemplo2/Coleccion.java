package Ejemplo2;

public class Coleccion {
	
	//attr
	private Album[] vectorAlbum;
	private int contadorAlbum;
		//el número de albumes guardados en el vector
		//la primera pos libre del vector
	
	
	//constr
	public Coleccion(int capacidad) {
		vectorAlbum = new Album[capacidad];
		contadorAlbum = 0;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		if (contadorAlbum == 0) {
			cadena = "------------------------------"
					+ "\nLa Colección no tiene álbumes."
					+ "\n------------------------------";
		}
		else {
			for (int pos = 0 ; pos < contadorAlbum ; pos++) {
				Album album = vectorAlbum[pos];
				cadena = cadena + "(" + pos + ") " + album.toString() + "\n";
			}
		}
		return cadena;
	}
	
	//Inserta un Album en la coleccion
	//Devuelve V si se puede insertar, F si está lleno
	public boolean insertar(Album album) {
		if (contadorAlbum < vectorAlbum.length) {
			vectorAlbum[contadorAlbum] = album;
			contadorAlbum++;
			return true;
		}
		else {
			return false;
		}
	}
	//elimina un album por pos en la coleccion
	//devuelve verdadero si el album se ha borrado
	//devuelve falso cuando el vector esta vacio o pos erronea
	public boolean eliminar(int pos) {
		if (pos < contadorAlbum && pos >= 0) {
			while (pos < contadorAlbum) {
				vectorAlbum[pos] = vectorAlbum[pos+1];
				pos++;
			}
			vectorAlbum[pos] = null;
			contadorAlbum--;
			return true;
		}
		else {
			return false;
		}
	}
	//Consultar un álbum de la colección
	//Devuelve un null si está vacío y es la posicion no es correcta.
	public Album consultar(int pos) {
		if (pos < contadorAlbum && pos >= 0) {
			return vectorAlbum[pos];
		}
		else {
			return null;
		}
	}
	public Album consultarNombre(String nombre) {
		boolean encontrado = false;
		Album albumEncontrado = null;
		Album album;
		for (int pos = 0 ; pos < contadorAlbum && !encontrado ; pos++) {
			album = vectorAlbum[pos];
			if (nombre.equals(album.getNombre()) ) {
				encontrado = true;
				albumEncontrado = album;
			}
		}
		return albumEncontrado;
	}
	
	
}
