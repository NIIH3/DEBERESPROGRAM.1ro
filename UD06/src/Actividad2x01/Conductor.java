package Actividad2x01;

public class Conductor extends Empleado {
	
	//attr estatico
	private static int numeroMaximoCarnets = 15;
	
	//attr
	private int numeroCarnets;
	private int annoCAP;
	
	
	//constr
	public Conductor(String nif, String nombre, Fecha fechaNacimiento, String direccion, String telefono, String correo,
			int numeroCarnets, int annoCAP) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, correo);
		if (numeroCarnets > 0 && numeroCarnets <= numeroMaximoCarnets) {
			this.numeroCarnets = numeroCarnets;
		}
		else {
			this.numeroCarnets = 1;
		}
		
		this.annoCAP = annoCAP;
	}


	@Override
	public String toString() {
		return "Conductor [numeroCarnets=" + numeroCarnets + ", annoCAP=" + annoCAP + "]";
	}


	
	// G y S
	public static int getNumeroMaximoCarnets() {
		return numeroMaximoCarnets;
	}


	public static void setNumeroMaximoCarnets(int numeroMaximoCarnets) {
		Conductor.numeroMaximoCarnets = numeroMaximoCarnets;
	}


	public int getNumeroCarnets() {
		return numeroCarnets;
	}


	public void setNumeroCarnets(int numeroCarnets) {
		this.numeroCarnets = numeroCarnets;
	}


	public int getAnnoCAP() {
		return annoCAP;
	}


	public void setAnnoCAP(int annoCAP) {
		this.annoCAP = annoCAP;
	}
	
	
	
	
	
	
	
	
}
