package conjunto_empleados;

public class Empleado implements Comparable<Empleado>{
	private String dni;
	private String nombre;
	private double salario;
	
	public Empleado(String dni, String nombre, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + dni + "| Nombre=" + nombre + "| Salario=" + String.format("%.2f", salario) + "]";
	}
	
	//Compara dos empleados por DNI
	@Override
	public int compareTo(Empleado otro) {
		return this.dni.compareToIgnoreCase(otro.dni);
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	public double getSalario() {
		return salario;
	}
	
	
}
