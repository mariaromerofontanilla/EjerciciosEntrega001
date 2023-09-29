package ejercicio3p3;

//importación de Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//variables
		//Variable del usuario
		int n;
		//Variable del usuario (multiplo)
		int n2;
		//Variable del multiplo
		int m;
		//Variable de la resta
		int b;
		//Variable de la suam
		int v;;
		
		//Variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el primer numero
		System.out.print("Introduzca un número: ");
		
		//Scan del segundo numero
		n = sc.nextInt();
		
		//Mensaje para introducir el segundo numero
		System.out.print("Introduzca un segundo número que será el valor del multiplo: ");
		
		//Scan del segundo número
		n2 = sc.nextInt();
		
		//Calculo del multiplo
		m = n % n2;
				
		//Calculo de la resta
		b = n2 - m;
		
		//Calculo de la suma
		v = n + b;
		
		//lee por pantalla el usuario el multiplo y lao que ahi que sumarle
		System.out.println("Para que sea multiplo de " + n2 + " hay que sumarle "  + b);
		//Creación del resultado con mensaje final
		String resultado = (v % n2 == 0) ? v + " es multiplo de " + n2 : v + " no es multiplo de " + n2;
		
		//Muestra en pantalla del resultado
		System.out.println(resultado);
		
		//Cierre de scanner
		sc.close();
	}
}
