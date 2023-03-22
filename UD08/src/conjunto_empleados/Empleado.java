package conjunto_empleados;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
	private String dni;
	private String nombre;
	private double salario;
	private String departamento;
	
	public Empleado(String dni, String nombre, double salario, String departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [DNI=" + dni + "| Nombre=" + nombre +  "| Departamento=" + departamento + "| Salario=" + String.format("%.2f", salario) + "]";
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


	public String getDepartamento() {
		return departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Empleado)) {
			return false;
		}
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
