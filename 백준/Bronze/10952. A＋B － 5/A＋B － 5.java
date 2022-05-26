import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.println(c);
			
		}
		
	}

}
