package conjunto_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import conjunto_turismo.OrdenTurismoMatriculaAsc;
import conjunto_turismo.Turismo;
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
		System.out.println("(13) Eliminar los empleados de un departamento de la plantilla");
		System.out.println("(14) Eliminar los empleados con un salario inferior a una cantidad de la plantilla");
		System.out.println("(15) Eliminar los empleados con un salario inferior a la media de los salarios de la plantilla");
		System.out.println();
	}
	
	public static void escribirConjuntoEmpleados(Set<Empleado> conjuntoEmpleados) {
		for (Empleado emp : conjuntoEmpleados) {
			System.out.println(emp.toString());
		}
		System.out.println(conjuntoEmpleados.size() + " empleados consultados");
	}
	
	
	public static void main(String[] args) {
		
		Plantilla plantilla = new Plantilla();
		Set<Empleado> conjEmpAux;
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
				
			case 2:
				conjEmpAux = plantilla.obtenerEmpleados();
				if (conjEmpAux.isEmpty()) {
					System.out.println("Esta plantilla está vacío");
				}
				else {
					for (Empleado e : conjEmpAux) {
						System.out.println(e.toString());
					}
					System.out.println(conjEmpAux.size() + " Empleados consultados");
				}
								
				break;
			case 3:
				

				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			case 12:
				
				break;
			case 13:
				
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
