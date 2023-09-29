package ejercicio8p3;

//importación de Scanner
import java.util.Scanner;

public class Ejercicio8p3 {

	public static void main(String[] args) {
		//variable
		//Variable precio ticket infantil
		final double INFANTIL = 15.50;
		//Variable precio ticket adulto
		final double ADULTOS = 20;
		//variable entradas infantil
		int entradasF;
		//variable entradas adultos
		int entradasA;
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//lee por pantalla el usuario, numero entradas infantiles
		System.out.println("Entradas infantiles: ");
		//Scanner de entradas infantiles
		entradasF = sc.nextInt();
		
		//lee por pantalla el usuario, numero entradas adultos
		System.out.println("Entradas de adultos: ");
		//Scaner de entradas adulto
		entradasA = sc.nextInt();
		
		//calculo
		//calculo total de precios
		double totalAF = (INFANTIL * entradasF)+ (ADULTOS * entradasA);
		//calculo del descuento
		double total = (totalAF >= 100) ? totalAF - ((totalAF * 5) /100) : totalAF;
		
		//lee por pantalla el usuario, mensaje final con resultado
		System.out.println("El total es: " + total);
		
		//cierre Scanner
		sc.close();
	}

}
