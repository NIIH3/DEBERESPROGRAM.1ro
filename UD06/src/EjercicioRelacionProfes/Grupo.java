package EjercicioRelacionProfes;

import Ejemplo2.Album;

public class Grupo {
	
	//attr
	private String nombre;
	private Alumno[] alumnos;
	private int indice;
	
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.alumnos = new Alumno[30];
		this.indice = 0;
	}
	
	public boolean insertar(Calificacion calificacion, Alumno alumno) {
		if (indice < alumnos.length) {
			alumnos[indice] = alumno;
			indice++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Calificacion[] consultarNotasAlumno(int expediente) {
		if (indice == null) {
			return null;
		}
		else {
			Calificacion[] calificaciones = null;
			boolean encontradas = false;
			for (int pos = 0 ; pos < indice && !encontradas ; pos++) {
				Alumno alumno = alumno[pos];
				if (alumno.getExpediente().equals(expediente)) {
					calificaciones = alumno.getCalificaciones();
					encontradas = true;
				}
			}
			return calificaciones;
		}
	}
}
