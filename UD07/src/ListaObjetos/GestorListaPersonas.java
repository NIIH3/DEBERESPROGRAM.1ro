package ListaObjetos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import entrada.Teclado;

public class GestorListaPersonas {
	
	public static void escribirMenuOpciones() {
		System.out.println();
		System.out.println("(0) Salir del Programa");
		System.out.println("(1) Insertar una Persona");
		System.out.println("(2) Consultar todas las Personas");
		System.out.println("(3) Eliminar una Persona por DNI");
		System.out.println("(4) Consultar una Persona por nombre");
		System.out.println("(5) Ordenar la lista por edad descendente");
		System.out.println("(6) Ordenar la lista por apellidos y nombres (ASCEND.)");
		System.out.println();
	}
	
	public static void escribirLista(List<Persona> lista) {
		for (Persona p : lista) {
			System.out.println(p.toString());
		}
		System.out.println(lista.size() + " personas consultadas");
	}

	public static void main(String[] args) {
		
		//Crear lista de Personas
		List<Persona> lista = new LinkedList<>();
		List<Persona> listaAux;
		String dni, nombre, apellidos;
		int opcion, edad, contPersonas = 0;
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("¿Opcion? ");
			Persona persona;
			switch (opcion) {
			
			//Salir del Programa
			case 0:
				break;
				
			//Insertar una Persona
			case 1:
				dni = Teclado.leerCadena("¿DNI? =");
				persona  = new Persona (dni, "", "", 0);
				if (lista.contains(persona)) {
					System.out.println("Ya existe una persona con ese DNI en la lista.");
				}
				else {
					nombre = Teclado.leerCadena("¿Nombre? = ");
					apellidos = Teclado.leerCadena("¿Apellidos? = ");
					edad = Teclado.leerEntero("¿Edad? = ");
					persona = new Persona(dni, nombre, apellidos, edad);
					if (lista.add(persona)) {
						System.out.println("Se ha insertado una Persona en la lista.");
					}
				}
				
				break;
			
			//Consultar todas las Personas
			case 2:
				if (lista.isEmpty() ) {
					System.out.println("La lista esta vacía.");
				}
				else {
					for (Persona p : lista) {
						System.out.println(p.toString());
					}
					System.out.println(lista.size() + " personas consultadas.");  
				}
				break;
				
			//Eliminar persona por DNI
			case 3:
				dni = Teclado.leerCadena("¿DNI? = ");
				persona  = new Persona (dni, "", "", 0);
				if (lista.remove(persona)) {
					System.out.println("Se ha eliminado una Persona de la lista.");
				}
				else {
					System.out.println("No se ha encontrado ninguna Persona con ese DNI");
				}
				break;
			
			//Consultar por nombre
			case 4:
				nombre = Teclado.leerCadena("¿Nombre? = ");
				listaAux = new LinkedList<Persona>();
				for (Persona p : lista) {
					if (p.getNombre().equalsIgnoreCase(nombre)) {
						listaAux.add(p);
					}
				}
				if (listaAux.isEmpty()) {
					System.out.println("No se ha encontrado ninguna persona con ese nombre");
				}
				else {
					escribirLista(listaAux);
				}
				System.out.println(contPersonas + " personas consultadas");
				break;
				
			//Ordenar por edad descendente
			case 5:
				listaAux = new LinkedList<Persona>();
				listaAux.addAll(lista);
				
				Collections.sort(listaAux, new OrdenPersonaPorEdadDescendente());
				if (listaAux.isEmpty()) {
					System.out.println("La lista está vacía");
				}
				
				
				if (lista.isEmpty() ) {
					System.out.println("La lista esta vacía.");
				}
				else {
					for (Persona p : lista) {
						System.out.println(p.toString());
					}
					System.out.println(lista.size() + " personas consultadas.");  
				}
				break;
			case 6:
				listaAux = new LinkedList<Persona>();
				listaAux.addAll(lista);
				
				Collections.sort(listaAux, new OrdenPersonaNombrAsc());
				if (listaAux.isEmpty()) {
					System.out.println("La lista está vacía");
				}
				
				
				if (lista.isEmpty() ) {
					System.out.println("La lista esta vacía.");
				}
				else {
					for (Persona p : lista) {
						System.out.println(p.toString());
					}
					System.out.println(lista.size() + " personas consultadas.");  
				}
				break;
			}
			
		}
		while (opcion != 0);
		System.out.println(">>>>Programa finalizado.<<<<");
	}

}
