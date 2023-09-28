package ejercicio6p3;

//importarcion del Scanner
import java.util.Scanner;

public class Ejercicio6p3 {

	public static void main(String[] args) {
		//variable
		
		//variable de segundos
		int s;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Lee por pantalla el usuario que introduzca los segundos
		System.out.println("Introduzca segundos: ");
		//Scanner de la variable
		s = sc.nextInt();
		
		//calculo
		//calculo de segundos a minutos
		int m = (s >= 60) ? (s%3600)/60 : 0;
		
		//calculo de segundos a horas
		int h = (s >= 60) ? s/3600 : 0;
		
		//calculo que muestra los segundos restantes
		int segundosMuestra = s % 60;
		
		//Lee el usuario por pantalla de las horas minutos y segundos
		System.out.println("Las horas son: " + h + " los minutos son: " + m + " los segundos son: " + segundosMuestra);
		 
		//cierre del Scanner
		sc.close();
	}

}
