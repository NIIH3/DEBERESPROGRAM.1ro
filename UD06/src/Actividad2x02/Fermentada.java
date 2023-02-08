package Actividad2x02;

import java.util.Random;

public class Fermentada extends Alcoholica {
	
	protected static final String[] NOMBRES = {
			"Sidra","Cerveza","Vino","Sake","Hidromiel"
	};
	
	public Fermentada(String nombre, double graduacionAlcohol) {
		super(nombre,graduacionAlcohol);
	}
	
	public Fermentada() {
		super(generarNombre(), generarGraduacion());
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES[aleatorio.nextInt(NOMBRES.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		return aleatorio.nextDouble() * (15 -3.5) + 3.5;
	}

	@Override
	public double calcularPrecio() {
		return 5 + (graduacionAlcohol / 10);
	}

	@Override
	public String toString() {
		return "Fermentada [Codigo = " + codigo + " | Nombre = " + nombre + " | Graduacion de Alcohol = " + String.format("%.1f", graduacionAlcohol) + "]";
	}
	
}
