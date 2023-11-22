import java.util.Scanner;

public class eje1 {

	public static void main(String[] args) {
		int num, j, cont=0;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			primo= true;
			j=2;
			while(j<=i-1 && primo==true) {
				if (i%j==0) {
					primo= false;
				}
				j++;
			}
			if (primo==true) {
				cont++;
			}
		}
		
		System.out.println(cont);
	}

}
