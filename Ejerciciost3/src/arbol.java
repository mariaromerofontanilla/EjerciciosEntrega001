import java.util.InputMismatchException;
import java.util.Scanner;

public class arbol {

	public static void main(String[] args) {
		int n=0, calculo=0;
		// Crear el Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que incgrese un numero entero
		System.out.print("Por favor, ingresa un número entero: ");
		// Scanner de la varianle n
		n = sc.nextInt();
		if (n > 0) {	
			for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)	
			 {
			System.out.print(" ");
			}
			for (int j = 1; j <= i; j++){
			System.out.print("* ");
			}
			System.out.println();
			}
			for (int i = 3; i <= n; i++) {
				for (int j = 1; j <= n - i; j++)	
				 {
				System.out.print(" ");
				}
				for (int j = 1; j <= i; j++){
				System.out.print("* ");
				}
				System.out.println();
			}
			for (int j=1;j<=n-2;j++) {
				for (int a=1;a<=n-1;a++) {
					System.out.print(" ");
				}
				if (calculo/2==0) {
					System.out.println("*");
				}
				
			}
		} else {
			// Imrpime por pantalla que introduzcas otro numero que sea mayor que 0
			System.out.println("Error, debes de introducir un numero mayor que 0");
		}
		// Cierre de la variable
		sc.close();
	}
}