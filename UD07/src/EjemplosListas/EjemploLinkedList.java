package EjemplosListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		
		
		//Crear un array list por defecto(Vacio y con 30 posiciones
		ArrayList<String> lista = new ArrayList<String>(30);
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Irene");
		lista.add("Isabel");
		lista.add("Jaime");
		lista.add("Elena");
		lista.add("Manolo");
		lista.add("Tobias");
		lista.add("Jaime");
		
		
		//Crear un linked list con los datos del array list
		LinkedList<String> lista2 = new LinkedList<String>(lista);
		
		//Visualizar metodo toString
		System.out.println();
		System.out.println("Visualizar con el metodo toString");
		System.out.println(lista2.toString());
		
		//comprobar si esta vacia
		System.out.println();
		if (lista2.isEmpty()) {
			System.out.println("Lista vacía");
		}
		else {
			System.out.println("Lista no vacía");
		}
		
		//Ordenar de forma ascendente
		System.out.println();
		Collections.sort(lista2);
		System.out.println("Lista ordenada de forma Ascendente");
		System.out.println(lista2.toString());
		
		//Ordenar de forma descendente
		System.out.println();
		Collections.sort(lista2, Collections.reverseOrder());
		System.out.println("Lista ordenada de forma Descendente");
		System.out.println(lista2.toString());
		
		//Ordenar de forma descendente V2
		System.out.println();
		System.out.println("Lista ordenada de forma Descendente");
		Collections.sort(lista2);
		Collections.reverse(lista2);
		System.out.println(lista2.toString());
		
	}
	
	

}
