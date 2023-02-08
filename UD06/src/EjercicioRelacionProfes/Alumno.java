package EjercicioRelacionProfes;

import java.util.Arrays;

import Act1x01.Videojuego;

public class Alumno {
	private String nombreApellidos;
	private int expediente;
	private Calificacion[] calificaciones;
	private int indice;
	
	public Alumno(String nombreApellidos, int expediente) {
		this.nombreApellidos = nombreApellidos;
		this.expediente = expediente;
		this.calificaciones = new Calificacion[7];
		this.indice = 0;
	}


	@Override
	public String toString() {
		return "Alumno [nombreApellidos=" + nombreApellidos + ", expediente=" + expediente 
				+ ", calificacion="
				+ Arrays.toString(calificaciones) + ", contadorCalificacion=" + indice + "]";
	}
	
	
	public boolean insertar(Calificacion calificacion) {
		if (indice < calificaciones.length) {
			calificaciones[indice] = calificacion;
			indice++;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Calificacion consultarMejorCalificacion() {
		if (indice == 0) {
			return null;
		}
		else {
			Calificacion mejorCalificacion = calificaciones[0];
			for (int pos = 1 ; pos <  indice ; pos++) {
				Calificacion calificacion = calificaciones[pos];
				if (mejorCalificacion.getNota() < calificacion.getNota()) {
					mejorCalificacion = calificacion;
				}
				
			}
			return mejorCalificacion;
		}
	}
	
	public Calificacion consultarCalificacion(String modulo) {
		Calificacion calif = null;
		for (int pos = 0 ; pos <= indice ; pos++ ) {
			Calificacion calificacion = calificaciones[pos];
			if (calificacion.getModulo().equals(modulo)) {
				
			}
		}
		
		return calif;
	}
	public boolean actualizar(String modulo, double nuevaNota) {
		Calificacion calificaciones = consultarCalificacion(modulo);
		if (calificaciones != null) {
			calificaciones.setNota(nuevaNota);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public int getExpediente() {
		return expediente;
	}


	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	

	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}


	// TODO
	public static void main(String[] args) {
		Alumno alumno = new Alumno("Juan", 1);
		alumno.insertar(new Calificacion("PRO",6));
		alumno.insertar(new Calificacion("BD",6));
		alumno.insertar(new Calificacion("FOL",5));
		alumno.insertar(new Calificacion("ING",5));
		alumno.insertar(new Calificacion("UY",9));
		alumno.insertar(new Calificacion("ENT",5));
		alumno.insertar(new Calificacion("SYS",7));
		
		Calificacion mejorCalificacion = alumno.consultarMejorCalificacion();
		if (mejorCalificacion != null) {
			System.out.println(mejorCalificacion.toString());
		}
		else {
			System.out.println("No hay calificacion");
		}
		System.out.println(mejorCalificacion.toString());
	}
 }
