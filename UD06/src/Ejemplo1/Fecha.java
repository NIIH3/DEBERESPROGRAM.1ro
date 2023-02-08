package Ejemplo1;

public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	
	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}
	
	@Override
	public String toString() {
		return "FECHA: "
				+ "\nDia: " + dia
				+ "\nMes: " + mes
				+ "\nAño: " + anno;
	}
	
}
