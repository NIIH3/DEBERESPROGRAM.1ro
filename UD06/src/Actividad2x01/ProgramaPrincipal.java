package Actividad2x01;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[10];
		empleados[0] = emp1;
		empleados[1] = emp2;
		empleados[2] = ofi1;
		empleados[3] = ofi2;
		empleados[4] = ofi3;
		empleados[5] = cond1;
		empleados[6] = cond2;
		empleados[7] = limp1;
		empleados[8] = limp2;
		empleados[9] = limp3;
		
		
		
		for (int posicion = 0 ; posicion < empleados.length ; posicion ++) {
			System.out.println("El empleado " + posicion + " ");
			if (empleados[posicion] instanceof Oficinista) {
				System.out.println("es un oficinista");
			}
			else if (empleados[posicion] instanceof Conductor) {
				System.out.println("es un conductor");
			}
			else if (empleados[posicion] instanceof Limpiador) {
				System.out.println("es un limpiador");
			}
		}

	}

}
