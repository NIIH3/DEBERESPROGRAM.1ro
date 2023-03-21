package conjunto_turismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entrada.Teclado;

public class GestorConjuntoTurismo {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del Programa.");
		System.out.println("(1) Insertar un Turismo en el conjunto");
		System.out.println("(2) Consultar todos los Turismos por orden de insercion");
		System.out.println("(3) Eliminar un Turismo por matrícula");
		System.out.println("(4) Ordenar el conjunto por matrícula");
		System.out.println("(5) Ordenar el conjunto por precio descendente");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Set<Turismo> conjunto = new LinkedHashSet<Turismo>();
		Set<Turismo> conjuntoOrdenado;
		List<Turismo> listaOrdenada;
		Turismo turismo;
		int opcion, agno;
		double precio;
		String matricula, marca, modelo;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción? = ");
			switch (opcion) {
			case 0:
				break;
				//Salir del programa
			case 1:
				//Insertar Turismo en el conjunto
				matricula = Teclado.leerCadena("¿Matricula? =");
				turismo = new Turismo(matricula, "", "", 0, 0.0);
				if (conjunto.contains(turismo)) {
					System.out.println("ERROR - Ya existe un turismo con esa matrícula");
				}
				else {
					marca = Teclado.leerCadena("¿Marca? = ");
					modelo = Teclado.leerCadena("¿Modelo? = ");
					agno = Teclado.leerEntero("¿Año? = ");
					precio = Teclado.leerReal("¿Precio? = ");
					turismo = new Turismo(matricula, modelo, marca, agno, precio);
					if (conjunto.add(turismo)) {
						System.out.println("Se ha añadido un Turismo al conjunto");
					}
				}
				break;
				
			case 2:
				if (conjunto.isEmpty()) {
					System.out.println("El conjunto está vacío");
				}
				else {
					for (Turismo t : conjunto) {
						System.out.println(t.toString());
					}
					System.out.println(conjunto.size() + " Turismos consultados");
				}
				break;
				
			case 3:
				matricula = Teclado.leerCadena("¿Matrícula? = ");
				turismo = new Turismo(matricula, "", "", 0, 0.0);
				if (conjunto.remove(turismo)) {
					System.out.println("Turismo eliminado del conjunto");
				}
				else {
					System.out.println("No existe un Turismo con esa matrícula");
				}
				break;
				
			case 4:
				conjuntoOrdenado = new TreeSet<Turismo>(new OrdenTurismoMatriculaAsc());
				conjuntoOrdenado.addAll(conjunto);
				if (conjuntoOrdenado.isEmpty()) {
					System.out.println("Este conjunto está vacío");
				}
				else {
					for (Turismo t : conjuntoOrdenado) {
						System.out.println(t.toString());
					}
					System.out.println(conjuntoOrdenado.size() + " Turismos consultados");
				}
				
				break;
				
			case 5:
				listaOrdenada = new ArrayList<Turismo>();
				listaOrdenada.addAll(conjunto);
				Collections.sort(listaOrdenada, new OrdenTurismoPrecioDescendente());
				if (listaOrdenada.isEmpty()) {
					System.out.println("Este conjunto está vacío");
				}
				else {
					for (Turismo t : listaOrdenada) {
						System.out.println(t.toString());
					}
					System.out.println(listaOrdenada.size() + " Turismos consultados");
				}
				break;
				
			default:
				System.out.println("La opcion ha de estar comprendida entre (0) y (5)");
				
			}
		}
		while (opcion != 0);
		System.out.println(">>>>> PROGRAMA FINALIZADO <<<<<");
	}

}
