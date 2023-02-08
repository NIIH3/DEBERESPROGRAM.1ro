package Actividad2x02;

import java.util.Random;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa");
		System.out.println("(1) Insertar un refresco");
		System.out.println("(2) Insertar una bebida aleatoria");
		System.out.println("(3) Rellenar inventario con bebidas aleatorias");
		System.out.println("(4) Consultar todas las bebidas");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int opcion, tipo, contRefr, contFerm, contDest;
		String nombre;
		double cantidadAzucar;
		boolean tieneGas;
		Refresco refresco;
		Fermentada fermentada;
		Destilada destilada;
		Bebida bebida;
		Random aleatorio = new Random();
		Inventario inventario = new Inventario(20);
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion? ");
			switch(opcion) {
			case 0:
				break;
				
			case 1:
				nombre = Teclado.leerCadena("¿Nombre? =");
				cantidadAzucar = Teclado.leerReal("¿Cantidad de azúcar? =");
				tieneGas = Teclado.leerBooleano("¿Tiene gas? =");
				refresco = new Refresco(nombre, cantidadAzucar, tieneGas);
				if (inventario.insertar(refresco)) {
					System.out.println("Refresco insertado");
				}
				else {
					System.out.println("Refresco no insertado");
				}
				
				break;
				
			case 2:
				tipo = aleatorio.nextInt(3);
				if (tipo==0) {
					bebida = new Refresco();
					inventario.insertar(refresco);
				}
				if (tipo==1) {
					bebida = new Fermentada();
					inventario.insertar(fermentada);
				}
				if (tipo==2) {
					bebida = new Destilada();
					inventario.insertar(destilada);
				}
				if (inventario.insertar(bebida)) {
					System.out.println("Bebida insertada");
				}
				else {
					System.out.println("Bebida no insertada");
				}
				break;
				
			case 3:
				contRefr = 0;
				contFerm = 0;
				contDest = 0;
				while (!inventario.estaLleno()) {
					tipo = aleatorio.nextInt(3);
					if (tipo==0) {
						bebida = new Refresco();
						inventario.insertar(bebida);
						if (inventario.insertar(bebida)) {
							contRefr++;
						}
					}
					if (tipo==1) {
						bebida = new Fermentada();
						inventario.insertar(fermentada);
						if (inventario.insertar(bebida)) {
							contFerm++;
						}
					}
					if (tipo==2) {
						bebida = new Destilada();
						inventario.insertar(destilada);
						if (inventario.insertar(bebida)) {
							contDest++;
						}
					}
					if (inventario.insertar(bebida)) {
						System.out.println("Bebida insertada");
					}
					else {
						System.out.println("Bebida no insertada");
					}
					System.out.println(contRefr + " refrescos insertados");
					System.out.println(contFerm + " bebidas fermentadas insertadas");
					System.out.println(contDest + " bebidas destiladas insertadas");
				}
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			}
			
		}
		while (opcion != 0);
		System.out.println("Aibaiba");

	}

}
