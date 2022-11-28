package ej2x03Tiempo;

public class Tiempo {

	//attribs
	private int horas;
	private int minutos;
	private int segundos;
	
	//constr
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public static boolean esValido(int hora, int minutos, int segundos) {
		if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0  && segundos < 60) {
			return true;
		}
		else {
			return false;
		}
	}
	public String obtenerEstado() {
		return ">>> TIEMPO <<<\n"
				+ "Horas = " + horas
				+ "\nMinutos = " + minutos
				+ "\nSegundos = " + segundos
				+ "\n[[[  "+horas+":"+minutos+"'"+segundos+"''"+" ]]]";
	}
	public boolean sumar(int horas, int minutos, int segundos) {
		boolean sumado = false;
			if (horas > 0 && minutos > 0 && segundos > 0) {
				this.horas = this.horas + horas;
				this.minutos = this.minutos + minutos;
				this.segundos = this.segundos + segundos;
			return true;
			}
			 return sumado;
	}
	public boolean restar(int horas, int minutos, int segundos) {
		boolean restado = false;
			if (horas > 0 && minutos > 0 && segundos > 0) {
				this.horas =this.horas + horas;
				this.minutos =this.minutos + minutos;
				this.segundos =this.segundos + segundos;
			return true;
			}
			 return restado;
	}
	
}
