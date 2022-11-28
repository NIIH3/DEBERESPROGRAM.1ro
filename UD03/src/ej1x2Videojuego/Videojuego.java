package ej1x2Videojuego;
import entrada.Teclado;

public class Videojuego {

	//att
	private String nombre;
	private String desarrollador;
	private int año;
	private int numJugadores;
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getDesarrollador() {
		return desarrollador;
	}
	
	public int getAño() {
		return año;
	}
	
	public int getNumJugadores() {
		return numJugadores;
	}
	
	//setters
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setDesarrollador (String desarrollador) {
		this.desarrollador = desarrollador;
	}
	
	public void setAño (int año) {
		this.año = año;
	}
	
	public void setNumJugadores (int numJugadores) {
		this.numJugadores = numJugadores;
	}
	
	//const
	public Videojuego(String nombre, String desarrollador, int año, int numJugadores) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.año = año;
		this.numJugadores = numJugadores;
	}
	
	public String estadoVidjg() {
		return 
			"\nNombre = " + nombre + "\nDesarrollador = " + desarrollador + "\nAño = " + año + "\nMaximo de jugadores por partida = " + numJugadores + "	";
		}

}


