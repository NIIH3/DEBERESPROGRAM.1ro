package ej2x1Cuenta;

import entrada.Teclado;

public class Actividad2x01 {

	public static void escribirMenu() {
		System.out.println();
		System.out.println(" (0) - Salir del programa");
		System.out.println(" (1) - Visualizar las 2 cuentas");
		System.out.println(" (2) - Ingresar importe Cuenta [1]");
		System.out.println(" (3) - Retirar importe Cuenta [1]");
		System.out.println(" (4) - Ingresar importe Cuenta [2]");
		System.out.println(" (5) - Retirar importe Cuenta [2]");
		System.out.println(" (6) - Transferir importe de la Cuenta [1] a la [2]");
		System.out.println(" (7) - Transferir importe de la Cuenta [2] a la [1]");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int opcion;
		double importe;
		Cuenta cuenta1 = new Cuenta(1, "Francisco Gómez");
		System.out.println("Se ha creado la cuenta [1]");
		Cuenta cuenta2 = new Cuenta(2, "Victoria Serrano");
		System.out.println("Se ha creado la cuenta [2]");
		
		do { escribirMenu();
			opcion = Teclado.leerEntero("Introduce una opcion (0 - 7): ");
			
			switch (opcion) {
			case 0:
				break;
				
			//Ver ambas cuentas
			case 1:
				System.out.println(cuenta1.obtenerEstado());
				System.out.println(cuenta2.obtenerEstado());
				break;
				
			//Ingresar cuenta 1
			case 2:
				importe = Teclado.leerReal("¿Importe a ingresar? ");
				if (cuenta1.ingresar(importe)) {
					System.out.println("Se ha ingresado el importe a la cuenta [1]");
				}
				else {
					System.out.println("Error al ingresar en cuenta [1]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
				
			//Retirar cuenta 1
			case 3:
				importe = Teclado.leerReal("¿Importe a retirar? ");
				if (cuenta1.retirar(importe)) {
					System.out.println("Se ha retirado el importe de la cuenta [1]");
				}
				else {
					System.out.println("Error al retirar de cuenta [1]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
				
			//Ingresar cuenta 2
			case 4:
				importe = Teclado.leerReal("¿Importe a ingresar? ");
				if (cuenta2.ingresar(importe)) {
					System.out.println("Se ha ingresado el importe a la cuenta [2]");
				}
				else {
					System.out.println("Error al ingresar en cuenta [2]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
			
			//Retirar cuenta 2
			case 5:
				importe = Teclado.leerReal("¿Importe a retirar? ");
				if (cuenta2.retirar(importe)) {
					System.out.println("Se ha retirado el importe de la cuenta [2]");
				}
				else {
					System.out.println("Error al retirar de cuenta [2]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
				
			//Transferir desde 1 a 2
			case 6:
				importe = Teclado.leerReal("¿Importe a transferir [1] >>> [2]?");
				if (cuenta1.transferir(importe, cuenta2)) {
					System.out.println("Se ha transferido el importe desde la cuenta [1] >>> [2]");
				}
				else {
					System.out.println("Error al retirar de cuenta [2]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
				
			//Transferir desde 2 a 1
			case 7:
				importe = Teclado.leerReal("¿Importe a transferir [2] >>> [1]?");
				if (cuenta2.transferir(importe, cuenta1)) {
					System.out.println("Se ha transferido el importe desde la cuenta [2] >>> [1]");
				}
				else {
					System.out.println("Error al transferir de cuenta [2]");
					System.out.println("El importe ha de ser positivo.");
				}
				break;
	
			}	
		}
		while (opcion != 0);
		System.out.println(">> Programa finalizado <<");
		
		

	}

}
