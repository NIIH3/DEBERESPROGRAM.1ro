package Ejemplo1;

public class Persona {
	private String nombre;
	private Fecha fechaNacimiento;
	
	public Persona(String nombre, int dia, int mes, int anno) {
		this.nombre = nombre;
		this.fechaNacimiento = new Fecha(dia, mes, anno);
	}
	
	@Override
	public String toString() {
		return "PERSONA: "
				+ "\nNombre: " + nombre
				+ "\nFecha de Nacimiento: " + fechaNacimiento;
				
	}
}
