package Actividad2x03;

import java.util.LinkedList;
import java.util.List;

public class Libreria {
		
	private String nombre;
	private List<Libro> listaLibros;
	
	
	public Libreria(String nombre) {
		this.nombre = nombre;
		this.listaLibros = new LinkedList<Libro>();
	}


	@Override
	public String toString() {
		String cadena = "";
		if (listaLibros.isEmpty()) {
			cadena = "La libreria está vacía";
		}
		else {
			for (int pos = 0 ; pos < listaLibros.size() ; pos++) {
				Libro libro = listaLibros.get(pos);
				cadena = cadena + "(" + pos + ")" + libro.toString() + "\n";
			}
			cadena = cadena + listaLibros.size() + " libros consultados";
		}
		return cadena;
		
	}


	public List<Libro> consultarPorEscritor(String escritor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
