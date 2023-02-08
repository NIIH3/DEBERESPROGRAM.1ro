package Actividad2x01;

public class Oficinista extends Empleado {
	
	//attr
	private String titulacion;
	private String turno;
	
	//constr	
	public Oficinista(String nif, String nombre, Fecha fechaNacimiento, String direccion, String telefono,
			String correo, String titulacion, String turno) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, correo);
		this.titulacion = titulacion;
		if (turno.equals("diurno") || turno.equals("vespertino") || turno.equals("nocturno")) {
			this.turno = turno;
		}
		else {
			this.turno = "diurno";
		}
	}

	@Override
	public String toString() {
		return "Oficinista [Titulacion=" + this.titulacion + "\n" + "turno=" + this.turno + "]";
	}

	//G y S
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
}
