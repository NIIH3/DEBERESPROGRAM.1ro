package Act1x01;

import Ejemplo2.Album;

public class Almacen {
	
	//att
	private Videojuego[] vectorVideojuego;
	private int indice;
	
	//constr
	public Almacen(int capacidad) {
		vectorVideojuego = new Videojuego[capacidad];
		indice = 0;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		if (indice == 0) {
			cadena = "----------------------"
					+ "\nEl almacén está vacío."
					+ "\n----------------------";
		}
		else {
			for (int pos = 0 ; pos < indice ; pos++) {
				Videojuego videojuego = vectorVideojuego[pos];
				cadena = cadena + "(" + pos + ") " + videojuego.toString() + "\n";
			}
		}
		return cadena;	
	}
	public boolean insertar(Videojuego videojuego) {
		boolean insertado = false;
		if (indice < vectorVideojuego.length) {
			vectorVideojuego[indice] = videojuego;
			indice++;
			insertado =  true;
		}
		return insertado;
	}
	public boolean eliminar(int pos) {
		boolean eliminado = false;
		if (pos < indice && pos >= 0) {
			while (pos < indice) {
				vectorVideojuego[pos] = vectorVideojuego[pos+1];
				pos++;
			}
			vectorVideojuego[pos] = null;
			indice--;
			eliminado = true;
		}
		return eliminado;
	}
	public Videojuego consultar(int pos) {
		if (pos < indice && pos >= 0) {
			return vectorVideojuego[pos];
		}
		else {
			return null;
		}
	}
}
