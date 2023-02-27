package Actividad1x01;

import entrada.Teclado;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Act1x01 {
	
	public static String solicitarCadena(String mensaje) throws IOException {
		String cadena = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		System.out.print(mensaje);
		cadena = teclado.readLine();
		return cadena;
	}
	
	public static short solicitarEnteroCorto(String mensaje, int numMaxErrores) throws IOException{
		String cadena = "";
		short numeroEnteroCorto = 0;
		boolean error = true;
		int contadorErrores = 0;
		while (error && contadorErrores <= numMaxErrores) {
			try {
				cadena = solicitarCadena(mensaje);
				numeroEnteroCorto = Short.parseShort(cadena);
				error = false;
			}
			catch (NumberFormatException nfe) {
				error = true;
				contadorErrores++;
				System.out.println("El dato no tiene formato de número entero.");
				System.out.println(nfe.toString());
				System.out.println("Error numero " + contadorErrores + ".");
			}
		}
		if (contadorErrores > numMaxErrores) {
			System.out.println("Se ha superado el numero máximo de " + numMaxErrores + " errores.");
		}
		return numeroEnteroCorto;
	}

	public static void main(String[] args) {
		try {
			short dividendo = solicitarEnteroCorto("¿Dividendo? = " , 3);
			short divisor = solicitarEnteroCorto("¿Divisor? = " , 3);
			if (dividendo % divisor == 0) {
				System.out.println(dividendo + " es divisible entre " + divisor);
			}
			else {
				System.out.println(dividendo + " no es divisible entre " + divisor);
			}
			System.out.println("Cociente: " + (dividendo / divisor));
			System.out.println("Resto: " + (dividendo % divisor));
		}
		catch (ArithmeticException ae) {
			System.out.println("Se ha producido un error aritmético: ");
			System.out.println(ae.toString());
		}
		catch (IOException ioe) {
			System.out.println("Se ha producido un error de entrada/salida: ");
			System.out.println(ioe.toString());
		}

	}

}
