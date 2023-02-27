package EjemploFinally;

import entrada.Teclado;

public class EjemploFinally {

	public static int dividir (int dividendo, int divisor) {
		int cociente = 0;
		try {
			cociente = dividendo / divisor;
			return cociente;
		}
		catch (ArithmeticException ae) {
			System.out.print("Error aritmetico: " + ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
		}
		finally {
			System.out.println("Fin de dividir");
		}
		return cociente;
	}
	
	public static void main (String[] args) {
		try {
			int a = Teclado.leerEntero("¿Número A? = ");
			int b = Teclado.leerEntero("¿Número B? = ");
			int c = dividir(a,b);
			System.out.println("Cociente = " + c);
		}
		catch (ArithmeticException ae) {
			System.out.print("Error aritmetico: " + ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
		}
		finally {
			System.out.println("Fin del main");
		}
	}
}
