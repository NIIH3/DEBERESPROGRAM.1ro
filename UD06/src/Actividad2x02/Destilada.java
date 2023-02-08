package Actividad2x02;

import java.util.Random;

public class Destilada extends Alcoholica {
	
	protected static final String[] NOMBRES = {
			"Anís", "Pacharán", "Ginebra", "Cognac","Ron", "Vodka", "Whisky", "Tequila"
	};

	
	public Destilada(String nombre, double graduacionAlcohol) {
		super(nombre,graduacionAlcohol);
	}

	public Destilada() {
		super(generarNombre(), generarGraduacion());
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES[aleatorio.nextInt(NOMBRES.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		return aleatorio.nextDouble() * (45 - 15) + 15;
	}
	
	@Override
	public double calcularPrecio() {
		return 12 + (graduacionAlcohol / 10);
	}

	@Override
	public String toString() {
		return "Destilada [Codigo = " + codigo + " | Nombre = " + nombre + " | Graduacion de Alcohol = " + String.format("%.1f", graduacionAlcohol) + "]";
	}
}
