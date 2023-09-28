package ejercicio7p3;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio7p3 {

	public static void main(String[] args) {
		//variables
		//variables de los milímetros
		double mili;
		//variable de los centimetros
		double centi;
		//variable de los metros
		double metro;
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Lo que lee por pantalla el usuario, de que debe de introducir los milímetros
		System.out.println("Introduce los milímetros: ");
		//Scannea milímetros
		mili = sc.nextDouble();
		
		//Lo que lee por pantalla el usuario, de que debe de introducir los centímetros
		System.out.println("Introduce los centimetros: ");
		//Scannea Centímetros
		centi = sc.nextDouble();
		
		//Lo que lee por pantalla el usuario, de que debe de introducir los metros
		System.out.println("Introduce los metros: ");
		//Scanea los metros
		metro = sc.nextDouble();
		
		//calculo
		//calculamos los milímetros a centímetros
		double a = (mili / 10);
		//calculamos los metros a centímetros
		double b = (metro * 100);
		//calculamos el total y hacemos una suma
		double total = (a + b + centi);
		
		//Lo que se lee por pantalla el total de todo
		System.out.println("El total del calculo en centímetros es: " + total);
		
		//cierre
		sc.close();

	}

}
