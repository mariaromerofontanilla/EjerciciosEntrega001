package ejercicio9p3;

import java.util.Scanner;

public class Ejercicio9p3 {

	public static void main(String[] args) {
	//variables
	//variable del numero1 que introducira el usuario
	double numero1;
	//variable del numero2 que introducira el usuario
	double numero2;
	//variable que te dira si es true o false
	boolean vf;
	//Crea nuevo scaner
	Scanner sc = new Scanner(System.in);
	
	//Le pide al usuario que introduzca un numero
	System.out.println("Introduce un numero: ");
	//Scanea el numero 1
	numero1 = sc.nextDouble();
	
	//Le pide al usuario que introduzca un numero
	System.out.println("Introduce otro numero: ");
	//Scanea el numero 2
	numero2 = sc.nextDouble();
	
	//calculo
	//calculo de si son iguales
	vf = (numero1 == numero2);
	
	//imprime por pantalla el calculo realizada
	System.out.println (vf);
	
	//Cierre Scanner
	sc.close();

	}

}
