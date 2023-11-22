import java.util.Scanner;

public class eje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i%2 == 0) {
				suma = suma + i;
			}
		}
		System.out.println(suma);
	}

}
