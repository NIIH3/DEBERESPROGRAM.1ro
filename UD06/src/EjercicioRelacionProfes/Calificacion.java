package EjercicioRelacionProfes;

public class Calificacion {
	
	//attr
	private String modulo;
	private double nota;
	
	public Calificacion(String modulo, int nota) {
		this.modulo = modulo;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Calificacion [modulo=" + modulo + ", nota=" + nota + "]";
	}

	public String getModulo() {
		return modulo;
	}
	public double getNota() {
		return nota;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public void setNota(double nuevaNota) {
		this.nota = nuevaNota;
	}
	
	
}
