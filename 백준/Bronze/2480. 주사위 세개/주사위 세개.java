import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int calc = 0;
		
		sc.close();
		
		if(a == b && a == c) {
			calc = 10000 + a * 1000;
		}
		else if(a == b || a == c) {
			calc = 1000 + a * 100;
		}
		else if (b == c) {
			calc = 1000 + b * 100;
		}
		else if(a != b && a != c) {
			int max = Math.max(Math.max(a, b), c);
			calc = max * 100;
		}
		
		System.out.println(calc);

	}

}
