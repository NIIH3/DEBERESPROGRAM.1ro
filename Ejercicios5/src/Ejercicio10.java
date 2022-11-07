import java.util.Scanner;
public class Ejercicio10 {
	
	//cuota minima de 2.00€ hasta 3 horas
	//a partir de 3h se carga 0.50€ cada hora
	//cargo maximo es 10€ cada 24h
	//ningun coche ha de estar más de 24h
	
	public static double CargoPorEstacion(int horas) {
		final double cuotaMin = 2.00;
		double cobroADC = 0.50;
		double cuota = 0;
		int contadorADC = 0;
		
		
		if (horas <= 3) {
			cuota = cuota + cuotaMin;
		} 
		
		else if (horas > 3) {
		contadorADC = horas;
		cobroADC = cobroADC + cobroADC * contadorADC;
		cuota = cobroADC;
		}
		
		if (cuota > 10) {
			cuota = 10;
		}
		return cuota;
	}
	
	
	public static void main(String[] args) {
		int horas = 0, contadorCond, conductores;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número de conductores estacionados: ");
		conductores = teclado.nextInt();
		
		if (conductores >= 0) {
			for (contadorCond = 1 ; contadorCond <= conductores ; contadorCond++) {
				
				System.out.println("Conductor " + contadorCond + ":");
				System.out.printf("Tiempo estacionado: ");
				horas = teclado.nextInt();
				
				if (horas < 1 || horas > 24) {
					System.out.println("ERROR - EL MÍNIMO ES 1 HORA, EL MÁXIMO ES 24.");
				}
				else
				System.out.println("Su cargo es: " + CargoPorEstacion(horas)+ "€");
			}
		}
		else {
			System.out.println("wtf como que " + conductores + " eres bobo o qué");
		}
	}

}
