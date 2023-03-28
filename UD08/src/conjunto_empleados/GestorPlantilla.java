package conjunto_empleados;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import entrada.Teclado;



public class GestorPlantilla {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del Programa.");
		System.out.println("(1) Insertar un Empleado en la plantilla");
		System.out.println("(2) Consultar todos los Empleados de la plantilla por DNI ascendente");
		System.out.println("(3) Consultar los Empleados por salario descendiente");
		System.out.println("(4) Eliminar un Empleado de la plantilla por DNI");
		System.out.println("(5) Consultar los empleados de un departamento de la plantilla");
		System.out.println("(6) Consultar los empleados por nombre y/o apellido de la plantilla");
		System.out.println("(7) Consultar el numero de empleados de cada departamento");
		System.out.println("(8) Consultar el numero de empleados que más cobran de cada departamento");
		System.out.println("(9) Consultar todos los empleados ordenados por departamento ascendente");
		System.out.println("(11) Incrementar un 5% el salario de los empleados de un departamento de la plantilla");
		System.out.println("(12) Mover los empleados con el DNI finalizado en 3 dígitos de un departamento de la plantilla");
		System.out.println("(13) Eliminar los empleados de un departamento");
		System.out.println("(14) Eliminar los empleados con un salario inferior a una cantidad de la plantilla");
		System.out.println("(15) Eliminar los empleados con un salario inferior a la media de los salarios de la plantilla");
		System.out.println();
	}
	
	public static void escribirEmpleados(Collection<Empleado> coleccionEmpleados) {
		for (Empleado emp : coleccionEmpleados) {
			System.out.println(emp.toString());
		}
		System.out.println(coleccionEmpleados.size() + " empleados consultados");
	}
	
	
	public static void main(String[] args) {
		
		Plantilla plantilla = new Plantilla();
		Set<Empleado> conjEmpAux;
		List<Empleado> listaAux = new LinkedList<Empleado>();
		Empleado empleado;
		double salario;
		int opcion;
		String dni, nombre, departamento;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion? = ");
			switch (opcion) {
			case 0:
				break;
			//Insertar un Empleado en la plantilla
			case 1:
				dni = Teclado.leerCadena("¿DNI? = ");
				if (plantilla.buscarPorDni(dni)) {
					System.out.println("Se ha encontrado otro empleado con ese DNI");
				}
				else {
					nombre = Teclado.leerCadena("¿Nombre? = ");
					departamento = Teclado.leerCadena("¿Departamento? = ");
					salario = Teclado.leerReal("¿Salario?");
					empleado = new Empleado(dni,nombre,salario, departamento);
					if (plantilla.insertar(empleado)) {
						System.out.println("----------------------------------------");
						System.out.println("Se ha añadido un empleado a la plantilla");
					}
				}
				break;
			//Consultar todos los Empleados de la plantilla por DNI ascendente
			case 2:
				conjEmpAux = plantilla.obtenerEmpleados();
				if (conjEmpAux.isEmpty()) {
					System.out.println("Esta plantilla está vacía");
				}
				else {
					for (Empleado e : conjEmpAux) {
						System.out.println(e.toString());
					}
					System.out.println(conjEmpAux.size() + " Empleados consultados");
				}
								
				break;
			//Consultar los Empleados por salario descendiente
			case 3:
				conjEmpAux = plantilla.obtenerEmpleados();
				if (conjEmpAux.isEmpty()) {
					System.out.println("Esta plantilla está vacía");
				}
				else {
					listaAux = plantilla.ordenarSalarioDescendente();
					for (Empleado e : listaAux) {
						System.out.println(e.toString());
					}
					System.out.println(conjEmpAux.size() + " Empleados consultados");
				}
				break;
			//Eliminar un Empleado de la plantilla por DNI
			case 4:
				dni = Teclado.leerCadena("¿Matrícula? = ");
				empleado = new Empleado(dni, "", 0, "");
				if (plantilla.eliminar(empleado)) {
					System.out.println("Turismo eliminado del conjunto");
				}
				else {
					System.out.println("No existe un Turismo con esa matrícula");
				}
				break;
				
			//Consultar los empleados de un departamento de la plantilla
			case 5:
				conjEmpAux = plantilla.obtenerEmpleados();
				if (conjEmpAux.isEmpty()) {
					System.out.println("Esta plantilla está vacía");
				}
				else {
					listaAux = plantilla.consultarPorDepartamento();
					for (Empleado e : listaAux) {
						System.out.println(e.toString());
					}
					System.out.println(conjEmpAux.size() + " Empleados consultados"); 
				}
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			//Consultar el numero de empleados que más cobran de cada departamento
			case 8:
				if (plantilla.estaVacia()) {
					System.out.println("Esta plantilla está vacía");
				}
				else {
					listaAux = plantilla.consultarEmpleadosPorDept();
					escribirEmpleados(listaAux);
					}
				break;
				
			//Consultar todos los empleados ordenados por departamento ascendente
			case 9:
				if (plantilla.estaVacia()) {
					System.out.println("Esta plantilla está vacía");
				}
				else {
					listaAux = plantilla.consultarPorDepartamentoNombreAsc();
				}
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			case 12:
				
				break;
				
			//Eliminar los empleados de un departamento
			case 13:
				if (plantilla.estaVacia()) {
					System.out.println("Esta plantilla está vacía");
				}
				int empleadosEliminados = 0;

				
				break;
			case 14:
				
				break;
			case 15:
				
				break;
			case 16:
				
				break;
			
				
			}
			
		}
		while(opcion != 0);
		System.out.println("PROGRAMA FINALIZADO");
	}

}
