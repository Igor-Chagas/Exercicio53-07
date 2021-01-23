import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de N:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
		int a = (int) Math.pow(i, 1);
		int b = (int) Math.pow(i, 2);
		int c = (int) Math.pow(i, 3);
		System.out.println(a + " " + b + " " + c);
		}
		sc.close();
	}

}
