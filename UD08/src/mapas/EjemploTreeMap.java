package mapas;

import java.util.TreeMap;

import entrada.Teclado;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploTreeMap {
	
	public static void main (String[] args) {
		//Crear un mapa de Alumnos cuya clave es un Nombre y su valor una Nota Numerica
		Map<String,Double> mapaAlumnos = new TreeMap<String,Double>();
		//Insertar varios alumnos con sus notas
		mapaAlumnos.put("Javier", 7.2);
		mapaAlumnos.put("Alex", 8.0);
		mapaAlumnos.put("Miguel", 5.7); 
		//Si se repite la clave:
		mapaAlumnos.put("Miguel", 3.2); //Sobreescribe el valor
		
		//Para usar el toString
		System.out.println(mapaAlumnos.toString());
		
		
		//Para recorrer el mapa, se usa un for-each sobre el conjunto de claves
		System.out.println("FOR-EACH CON keySet");
		for (String clave : mapaAlumnos.keySet()) {
			Double valor = mapaAlumnos.get(clave);
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
		
		//Recorrer con un iterador sobre el conjunto de claves
		System.out.println("ITERADOR CON keySet");
		Iterator<String> iterador = mapaAlumnos.keySet().iterator();
		while (iterador.hasNext()) {
			String clave = iterador.next();
			Double valor = mapaAlumnos.get(clave);
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
		
		//Recorrer solo con valores del mapa
		System.out.println("FOR-EACH CON values");
		for (Double valor : mapaAlumnos.values()) {
			System.out.println("Valor = " + valor);
		}
		
		//Recorrer con for-each en conjunto de Entradas
		System.out.println("FOR-EACH for entrySet()");
		for (Entry<String,Double> entrada : mapaAlumnos.entrySet()) {
			String clave = entrada.getKey();
			Double valor = entrada.getValue();
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
		
		//Recorrer con un iterador sobre el conjunto de entradas
		System.out.println("ITERADOR CON entrySet()");
		Iterator<Entry<String,Double>> iterador2 = mapaAlumnos.entrySet().iterator();
		while (iterador2.hasNext()) {
			Entry<String,Double> entrada = iterador2.next();
			String clave = entrada.getKey();
			Double valor = entrada.getValue();
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
		
		//Modificar la nota del alumno
		String alumno = Teclado.leerCadena("¿Alumno? = ");
		if (mapaAlumnos.containsKey(alumno)) {
			Double nuevaNota = Teclado.leerReal("¿Nueva nota? = ");
			mapaAlumnos.put(alumno, nuevaNota);
			System.out.println("Alumno modificado");
		}
		else {
			System.out.println("Alumno no encontrado");
		}
		
		//Eliminar un alumno
		alumno = Teclado.leerCadena("Alumno a eliminar? = ");
		if (mapaAlumnos.remove(alumno) != null) {
			System.out.println("Alumno eliminado");
		}
		else {
			System.out.println("Alumno no encontrado");
		}
	}
	
	//Guardar los telefonos de una agenda de contactos
	
}
