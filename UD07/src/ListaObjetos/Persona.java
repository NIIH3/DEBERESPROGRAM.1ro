package ListaObjetos;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	public Persona(String dni, String nombre, String apellidos, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [DNI = " + dni + "| Nombre = " + nombre + "| Apellidos = " + apellidos + "| Edad = " + edad + "]";
	}


	@Override
	public int compareTo(Persona otra) {
		return this.dni.compareTo(otra.dni) ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	//SOLO PARA LISTAS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
}
