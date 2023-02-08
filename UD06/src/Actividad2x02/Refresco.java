package Actividad2x02;

import java.util.Random;

public abstract class Refresco extends Bebida {
	
	protected double cantidadAzucar;
	protected boolean tieneGas;
	
	protected static final String[] NOMBRES= {
			"Limonada", "Cola", "Gaseosa", "Te Helado", "Granizado", "Ponche"
	};
	
	public Refresco(String nombre, double cantidadAzucar, boolean tieneGas) {
		super(nombre);
		this.cantidadAzucar = cantidadAzucar;
		this.tieneGas = tieneGas;
	}

	public Refresco() {
		super(generarNombre());
		Random aleatorio = new Random();
		this.cantidadAzucar = aleatorio.nextDouble(35-4) + 4;
		this.tieneGas = aleatorio.nextBoolean();
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES[aleatorio.nextInt(NOMBRES.length)];
	}
	
	@Override
	public String toString() {
		return "Refresco [Codigo = " + codigo + " | Nombre = " + nombre + " | Cantidad de Azucar = " + String.format("%.1f", cantidadAzucar) + " | Gas = " + tieneGas + "]";
	}
	
	
	
}
