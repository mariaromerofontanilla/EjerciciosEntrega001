package ejercicio2p3;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//variables
		//Variable del usuario
		int n;
		//Variable del multiplo
		int m;
		//Variable de la resta
		int b;
		//Variable de la suam
		int v;
		
		//Variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el numero
		System.out.print("Introduzca un número: ");
		
		//Scan del numero
		n = sc.nextInt();
		
		//Calculo del multiplo
		m = n % 7;
				
		//Calculo de la resta
		b = 7 - m;
				
		//Calculo de la suma
		v = n + b;
		
		//Mensaje de la suma
		System.out.println("Para que sea multiplo de 7 hay que sumarle "  + b);
		//Creación del resultado y mensaje final
		String resultado = (b % 7 == 0) ? v + " es multiplo de 7" : v + " no es multiplo de 7";
		
		//Muestra en pantalla del resultado
		System.out.println(resultado);
		
		//Cierre de scanner
		sc.close();
	}
}
