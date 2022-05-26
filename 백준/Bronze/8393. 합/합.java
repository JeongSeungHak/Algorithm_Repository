import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		int sum = 0;
		
		for(int i = 0; i <= a; i++) {
			sum = sum + i;	
		}
		
		System.out.println(sum);
		
	}

}
