import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			if(x > a) {
				System.out.print(a + " ");
			}
		}

	}

}
