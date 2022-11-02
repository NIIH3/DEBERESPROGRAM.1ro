import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		double notaTeo = 0, notaPrac = 0, notaProb = 0, notaFin = 0, sumaNotaFin = 0;
		int nota = 0, contador = 1, contadorAlumnos = 0;
		boolean notaValida;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("NOTAS ALUMNOS: ");
		
		while (contador != 11) {
			
			System.out.println("Alumno: " + contador);
			
			System.out.printf("Nota Teoría: ");
			notaTeo = teclado.nextInt();
			if (notaTeo < 0 || notaTeo > 10) {
				System.out.println("La nota TEÓRICA debe de estar comprendida entre 0 y 10.");
			}
			System.out.printf("Nota Problemas: ");
			notaProb = teclado.nextInt();
			if (notaProb < 0 || notaProb > 10) {
				System.out.println("La nota de PROBLEMAS debe de estar comprendida entre 0 y 10.");
			}
			System.out.printf("Nota Práctica: ");
			notaPrac = teclado.nextInt();
			if (notaPrac < 0 || notaPrac > 10) {
				System.out.println("La nota PRÁCTICA debe de estar comprendida entre 0 y 10.");
			}
			
			
			contador = contador + 1;
		}
		System.out.println("Alumnos aprobados: " + contadorAlumnos);
		System.out.println("Suma de notas finales: " + sumaNotaFin);
		System.out.println("Media de notas finales: " + notaFin);
		

		
	}

}
