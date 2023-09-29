package ejercicio5p3;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio5p3 {

	public static void main(String[] args) {
		//variable
		//variable a que pondra el usuario el valor
		double a;
		//variable b que pondra el usuario el valor
		double b;
		//variable c que pondra el usuario el valor
		double c;
		//variable x que pondra el usuario el valor
		double x;
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Lee por pantalla el usuario de que introduzca un valor para a
		System.out.println("Introduce un valor para a: ");
		//Scaneo de a
		a = sc.nextDouble();
		
		//Lee por pantalla el usuario de que introduzca valor de b
		System.out.println("Introduce un valor para b: ");
		//Scaneo de b
		b = sc.nextDouble();
		
		//Lee por pantalla el usuario de que introduzca valor de c
		System.out.println("Introduce un valor para c: ");
		//Scaneo de c
		c = sc.nextDouble();
		
		//Lee por pantalla el usuario de que introduzca valor de x
		System.out.println("Introduce un valor para x: ");
		//Scaneo de x
		x = sc.nextDouble();
		//variable del valor x
		double m = x;
		//elevado del valor x
		x=Math.pow(x, 2);
		
		//calculo
		double y = (a*x + b*m + c);
		
		//Imprime por pantalla el resultado
		System.out.println("El valor del poligono de segundo grado es: " + y );
		
		//cierre de escanner
		sc.close();

	}

}
