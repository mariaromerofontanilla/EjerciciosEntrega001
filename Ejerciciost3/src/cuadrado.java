import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
		// variable
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		for (int i = 0; i< num; i++) {
			for (int j=0;j<num+8; j++) {
				if (i==0 ||i==num-1||j==0||j == num+7 ||i==num/2||j==(num/2)+4)
				//if(i==0 ||i==num-1||j==0||j == num+4 || i==j/2+1||i==num-j/2-3||i==num/2||j==(num/2)+2)
					{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
