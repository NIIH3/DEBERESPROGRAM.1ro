package Actividad2x02;

public abstract class Bebida {
	
	
	private static int contador = 0;
	
	protected int codigo;
	protected String nombre;
	
	public Bebida(String nombre) {
		contador++;
		this.nombre = nombre;
		this.codigo = contador;
	}

	@Override
	public String toString() {
		return "Bebida [Codigo = " + codigo + " | Nombre = " + nombre + "]";
	}
	
	public abstract double calcularPrecio();
	

}
