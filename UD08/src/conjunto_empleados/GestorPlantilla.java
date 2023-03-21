package conjunto_empleados;

import java.util.Set;

import entrada.Teclado;

public class GestorPlantilla {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del Programa.");
		System.out.println("(1) Insertar un Empleado en la plantilla");
		System.out.println("(2) Consultar todos los Empleados de la plantilla por DNI ascendente");
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
		Empleado empleado;
		double salario;
		int opcion;
		String dni, nombre;
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
					salario = Teclado.leerReal("¿Salario?");
					empleado = new Empleado(dni,nombre,salario);
				}
				break;
				
			case 2:
				if (plantilla.estaVacia()) {
					System.out.println("Plantilla vacia");
				}
				else {
					escribirConjuntoEmpleados(plantilla.obtenerEmpleados());
				}
								
				break;
			}
			
		}
		while(opcion != 0);
		System.out.println("PROGRAMA FINALIZADO");
	}

}
