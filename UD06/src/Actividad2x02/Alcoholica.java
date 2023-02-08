package Actividad2x02;

public abstract class Alcoholica extends Bebida {

	protected double graduacionAlcohol;
	
	
	public Alcoholica(String nombre, double graduacionAlcohol) {
		super(nombre);
		this.graduacionAlcohol = graduacionAlcohol;
		}


	@Override
	public String toString() {
		return "Alcoholica [Codigo = " + codigo + " | Nombre = " + nombre + " | Graduacion de Alcohol = " + String.format("%.1f", graduacionAlcohol) + "]";
	}
	
}
