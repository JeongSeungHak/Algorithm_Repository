import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {			
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			System.out.println(c + d);
			
		}
		sc.close();
		
	}

}
