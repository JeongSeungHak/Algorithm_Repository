import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = 1 + i;
			int d = a + b;
			
			System.out.println("Case #" + c + ": " + d);
		}

	}

}
