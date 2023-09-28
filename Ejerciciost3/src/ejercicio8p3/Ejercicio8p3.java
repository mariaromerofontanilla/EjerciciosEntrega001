package ejercicio8p3;

import java.util.Scanner;

public class Ejercicio8p3 {

	public static void main(String[] args) {
		//variable
		//
		final double INFANTIL = 15.50;
		final double ADULTOS = 20;
		int entradasF;
		int entradasA;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entradas infantiles: ");
		entradasF = sc.nextInt();
		
		System.out.println("Entradas de adultos: ");
		entradasA = sc.nextInt();
		
		//calculo
		double totalAF = (INFANTIL * entradasF)+ (ADULTOS * entradasA);
		double total = (totalAF >= 100) ? totalAF - ((totalAF * 5) /100) : totalAF;
		
		System.out.println("El total es: " + total);
		
		sc.close();
	}

}
