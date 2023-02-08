package Actividad2x01;

public class Fecha {

	private int dia;
	private int mes;
	private int anno;
	
	
	public Fecha(int dia, int mes, int anno) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}


	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anno=" + anno + "]";
	}

	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
}
