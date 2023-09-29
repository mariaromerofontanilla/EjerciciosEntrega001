package ejercicio10p3;

//importación del scanner
import java.util.Scanner;

public class Ejercicio10p3 {

	public static void main(String[] args) {
		//variable
		//Variable de longitud metros
		double metro;

		//Variable de longitud cm
		int cm;
				
		//Variable Scanner
		Scanner sc = new Scanner(System.in);

		//Mensaje de datos
		System.out.print("Introduce la longitud en metros: ");

		//Scan de longitud
		metro = sc.nextDouble();

		//Calculo de longitud de metros a centímetros
		cm = (int) (metro * 100);

		//Mensaje del resultado final
		System.out.println("Se ha lanzado a una distancia de: " + cm + "cm");

		//Cierre del Scanner
		sc.close();
	}

}
