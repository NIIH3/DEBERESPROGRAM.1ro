package Actividad2x01;

public class Empleado {

	//attr
	private String nif;
	private String nombre;
	private Fecha fechaNacimiento; 
	private String direccion;
	private String telefono;
	private String correo;
	
	public Empleado(String nif, String nombre, Fecha fechaNacimiento, String direccion, String telefono,
			String correo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}
	
	
}
