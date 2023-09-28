package ejercicio4p3;

//importación del scanner
import java.util.Scanner;

public class Ejercicio4p3 {

	public static void main(String[] args) {
		//variable
		//Variable de la base del triangulo
		double baseT;
		//Variable de la altura del triangulo
		double alturaT;
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Lee por pantalla el uruario y pide que introduzca la base del triangulo
		System.out.println("Introduce la base del triangulo: ");
		//Sacannea la base del triangulo que introdujo el usuario
		baseT = sc.nextDouble();
		
		//lo que lee el usuario por pantalla y pide que introduzca la altura del triangulo
		System.out.println("Introduce la altura del triangulo: ");
		//scanner de la altura del triangulo
		alturaT = sc.nextDouble();
		
		//calculo
		double total = (baseT*alturaT/2);
		
		//Lo que el usuario ve por pantalla y visualiza el area del triangulo
		System.out.println("El area del triangulo es:" + total);
		
		//cierre
		sc.close();

	}

}
