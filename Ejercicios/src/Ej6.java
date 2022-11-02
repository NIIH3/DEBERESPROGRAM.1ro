import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
	
		int numeroChicos, numeroChicas;
		double porcentajeChicos, porcentajeChicas;
		Scanner teclado = new Scanner (System.in);
				
		System.out.print("Introduce el número de Chicos: ");
		numeroChicos = teclado.nextInt();
		System.out.print("Introduce el número de Chicas: ");
		numeroChicas = teclado.nextInt();
		
		porcentajeChicos = numeroChicos * 100.0 / (numeroChicos + numeroChicas);
		porcentajeChicas = 100.0 - porcentajeChicos;
		
		System.out.printf("\nPorcentaje de Chicos: %.2f%%\n", porcentajeChicos);
		System.out.printf("Porcentaje de Chicas: %.2f%%\n", porcentajeChicas);

	}

}