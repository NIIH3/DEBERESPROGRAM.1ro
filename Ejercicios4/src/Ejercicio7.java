import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		int numA, numB;
		double resultadoM;
		double contadorMult = 0;
		boolean natural;
		Scanner teclado = new Scanner(System.in);
		

		System.out.printf("Número natural A: ");
		numA = teclado.nextInt();
		System.out.printf("Número natural B: ");
		numB = teclado.nextInt();
		
		natural = true;
		if (numA > numB) {
			System.out.println("El número A ha de ser menor o igual al número B");
			natural = false;
		}
		if (natural) {
			System.out.println("TABLA DEL NUMERO "+ numA);
			while (contadorMult != 11) {
				resultadoM = numA * contadorMult;
				System.out.printf(numA + " * " + contadorMult + " = %.0f %n" , resultadoM);
				contadorMult++;
			}
			contadorMult = 0;
			System.out.println();
			
			System.out.println("TABLA DEL NUMERO "+ numB);
			while (contadorMult != 11) {
				resultadoM = numB * contadorMult;
				System.out.printf(numB + " * " + contadorMult + " = %.0f %n " , resultadoM);
				contadorMult++;
			}
		}
	}

}
