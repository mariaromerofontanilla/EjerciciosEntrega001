import java.util.Scanner;

public class rombo {

	public static void main(String[] args) {
		// variable
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j=1; j<= num - i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i<=num;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=num-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
