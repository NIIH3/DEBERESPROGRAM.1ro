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
	public boolean restar(Tiempo otro) {
		int segundos = this.segundos - otro.segundos;
		int minutos = this.minutos - otro.minutos;
		int horas = this.horas - otro.horas;
		boolean restado = false;
		if (segundos >= 0) {
			segundos = segundos + 60;
			minutos--;
		}
		if (minutos >= 0) {
			minutos = minutos + 60;
			horas--;
		}
		if (horas >= 0) {
			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;
			restado = true;
		}
		return restado;
	}
	public boolean sumar(Tiempo otro) {
		int segundos = this.segundos + otro.segundos;
		int minutos = this.minutos + otro.minutos;
		int horas = this.horas + otro.horas;
		boolean sumado = false;
		if (segundos >= 60) {
			segundos = segundos - 60;
			minutos++;
		}
		if (minutos >= 60) {
			minutos = minutos - 60;
			horas++;
		}
		if (horas < 24) {
			this.segundos = segundos;
			this.minutos = minutos;
			this.horas = horas;
			sumado = true;
		}
		return sumado;
	}
	
}
