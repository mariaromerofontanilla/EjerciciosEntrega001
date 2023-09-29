package ejercicio1p3.ejercicio1p3;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1p3 {

	public static void main(String[] args) {
		//variables
		//variable del numero decimal que utilizaremos
		double numero;
		double red = 0.5;
		double resultado;
		//Llamamos al Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		//Pregunta al usuario el numero que desea utilizar
		System.out.println("Introduzca el numero que desea redondear: ");
		//Lee por pantalla el numero que desea ver
		numero = sc.nextDouble();
		
		//Calculo del redondeo
		resultado = numero + red;
		
		//Mensaje final
		System.out.println("El resultado es: " + (int) resultado);
		
		//cierre del Scanner
		sc.close();
		
	}

}
