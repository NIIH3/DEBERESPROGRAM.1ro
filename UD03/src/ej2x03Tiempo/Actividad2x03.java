package ej2x03Tiempo;

import entrada.Teclado;

public class Actividad2x03 {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) - Salir del programa");
		System.out.println("(1) - Leer / Crear tiempo");
		System.out.println("(2) - Visualizar el tiempo");
		System.out.println("(3) - Sumar un tiempo a otro");
		System.out.println("(4) - Restar un tiempo a otro");
		System.out.println("(5) - Comparar un tiempo a otro");
		System.out.println();
	}
	public static Tiempo leerTiempoValido() {
		int horas = Teclado.leerEntero("¿Hora? = ");
		int minutos = Teclado.leerEntero("¿Minutos? = ");
		int segundos = Teclado.leerEntero("¿Segundos? = ");
		while (! Tiempo.esValido(horas, minutos, segundos)) {
			System.out.println("DATOS NO VALIDOS");
			System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVV");
			horas = Teclado.leerEntero("¿Hora? = ");
			minutos = Teclado.leerEntero("¿Minutos? = ");
			segundos = Teclado.leerEntero("¿Segundos? = ");
		}
		Tiempo tiempo = new Tiempo(horas, minutos, segundos);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println(">>  Se ha creado un registro temporal  <<");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		return tiempo;
		
	}

	public static void main(String[] args) {
		int opcion, horas = 0, minutos = 0, segundos = 0;
		Tiempo tiempo = null;
		Tiempo otroTiempo = null;
		
		System.out.println("Se ha creado un registro de tiempo");
		
		do { escribirMenu();
		opcion = Teclado.leerEntero("¿Opción (0) - (5)? = ");
		switch (opcion) {
		case 0:
			
			break;
			
		case 1:
			tiempo = leerTiempoValido();
			break;
			
		case 2:
			if (tiempo == null) {
				System.out.println("No se ha creado un margen de tiempo");
			}
			else {
				System.out.println(tiempo.obtenerEstado());
			}
			break;
			
		case 3:
			if (tiempo == null) {
				System.out.println("No existe ningún tiempo válido ");
			} else {
				otroTiempo = leerTiempoValido();
				System.out.println("Se ha creado otro tiempo válido ");
				System.out.println(tiempo.obtenerEstado() + " + " + otroTiempo.obtenerEstado());
			}
			if (tiempo.sumar(otroTiempo)) {
				System.out.println(tiempo.obtenerEstado());
			} else {
				System.out.println("Error al sumar el tiempo más otro tiempo ");
				System.out.println("La suma debe ser igual o inferior a 23h:59m:59s ");
			}
			break;
			
		case 4:
			if (tiempo == null) {
				System.out.println("No existe ningún tiempo válido ");
			} else {
				otroTiempo = leerTiempoValido();
				System.out.println("Se ha creado otro tiempo válido ");
				System.out.println(tiempo.obtenerEstado() + " - " + otroTiempo.obtenerEstado());
			}
			if (tiempo.restar(otroTiempo)) {
				System.out.println(tiempo.obtenerEstado());
			} else {
				System.out.println("Error al restar el tiempo más otro tiempo ");
				System.out.println("La resta debe ser igual o superior a 00h:00m:00s ");
			}
			break;
			
		case 5:
			if (tiempo == null) {
				System.out.println("No se ha creado un margen de tiempo");
			}
			else {
				
			}
			break;
		default:
			System.out.println("La opción del menú debe estar comprendida entre (0 - 4) ");
			break;
			
		}	
		}
		while( opcion != 0);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println(">>  Se ha finalizado el programa  <<");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

}
