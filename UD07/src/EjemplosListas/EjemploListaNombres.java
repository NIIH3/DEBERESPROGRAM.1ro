package EjemplosListas;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploListaNombres {

	public static void main(String[] args) {
		
		//Crear un array list por defecto(Vacio y con 10 posiciones
		ArrayList<String> lista = new ArrayList<String>(10);
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Irene");
		lista.add("Isabel");
		lista.add("Jaime");
		if (lista.add("Elena")) {
			System.out.println("Elena añadida");
		}
		
		//recorrer por posicion
		System.out.println();
		System.out.println("Recorrer por posicion:");
		for (int pos = 0 ; pos < lista.size(); pos++) {
			String elem = lista.get(pos);
			System.out.println(elem);
		}
		
		//Recorrer por iterador
		System.out.println();
		System.out.println("Recorrer con un iterador");
		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {
			String elem = iterador.next();
			System.out.println(elem);
		}
		
		//Recorrer con un bucle for-each
		System.out.println();
		System.out.println("Recorrer con un bucle for-each");
		for (String elem : lista) {
			System.out.println(elem);
		}
		
		//Visualizar metodo toString
		System.out.println();
		System.out.println("Visualizar con el metodo toString");
		System.out.println(lista.toString());
		
		//Buscar por nombre
		System.out.println();
		if (lista.contains("Juanito")) {
			System.out.println("Juanito encontrado");
		}
		else {
			System.out.println("Juanito no encontrado");
		}
				//Obtener la posicion de un nombre
		System.out.println();
		System.out.println("Obtener la posicion de un nombre");
		int pos = lista.indexOf("Jaime");
		if (pos == -1) {
			System.out.println("Jaime no encontrado");
		}
		else {
			System.out.println("Jaime encontrado en posicion: " + pos);
		}
		
		//Eliminar
		System.out.println();
		System.out.println("Eliminar de la lista");
		if (lista.remove("Jaime")) {
			System.out.println("Primer Jaime eliminado");
		}
		else {
			System.out.println("Jaime no eliminado");
		}
		System.out.println(lista.toString());

	}

}
