import java.util.Scanner;
public class Ejercicio10 {
	
	//cuota minima de 2.00€ hasta 3 horas
	//a partir de 3h se carga 0.50€ cada hora
	//cargo maximo es 10€ cada 24h
	//ningun coche ha de estar más de 24h
	
	public static double CargoPorEstacion(int horas, double euro) {
		double cuotaMin = 2.00;
		double cobroADC = 0.50;
		double cuota = 0;
		int contadorADC;
		
		
		for (contadorADC = 0 ; contadorADC == horas; cobroADC++) {
			while (horas <= 3) {
				cuota = cuota + cuotaMin;
			}
			if (horas > 3) {
				cuota = cuota + cobroADC;
			}
			
		}
		return cuota;
	}
	
	
	public static void main(String[] args) {
		int horas = 0, contadorCond, conductores;
		double euro;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número de conductores estacionados: ");
		conductores = teclado.nextInt() +1;
		
		
		for (contadorCond = 0 ; contadorCond < conductores + 1 ; contadorCond++) {
			while (contadorCond < conductores) {
				System.out.println("Conductor " + contadorCond + ":");
				System.out.printf("Tiempo estacionado: ");
				horas = teclado.nextInt();
				
				if (horas < 0 || horas > 24) {
					System.out.println("ERROR - EL MÍNIMO ES 0 HORAS, EL MÁXIMO ES 24.");
				}
				System.out.println("Su cargo es: " + CargoPorEstacion(horas, euro = 0));
				contadorCond = contadorCond+1;
			}
		}
	}

}
