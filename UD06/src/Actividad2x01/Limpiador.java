package Actividad2x01;

public class Limpiador extends Empleado {
	
	//atr
	private boolean limpiaOficinas;
	private boolean limpiaBuses;
	private boolean limpiaGarajes;

	
	//Constr
	public Limpiador(String nif, String nombre, Fecha fechaNacimiento, String direccion, String telefono, String correo, boolean limpiaOficinas, boolean limpiaBuses, boolean limpiaGarajes) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, correo);
		this.limpiaOficinas = limpiaOficinas;
		this.limpiaBuses = limpiaBuses;
		this.limpiaGarajes = limpiaGarajes;
	}


	// G y S
	public boolean isLimpiaOficinas() {
		return limpiaOficinas;
	}
	public boolean isLimpiaBuses() {
		return limpiaBuses;
	}
	public boolean isLimpiaGarajes() {
		return limpiaGarajes;
	}

	public void setLimpiaBuses(boolean limpiaBuses) {
		this.limpiaBuses = limpiaBuses;
	}
	public void setLimpiaOficinas(boolean limpiaOficinas) {
		this.limpiaOficinas = limpiaOficinas;
	}
	public void setLimpiaGarajes(boolean limpiaGarajes) {
		this.limpiaGarajes = limpiaGarajes;
	}
	
	
}
