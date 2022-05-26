import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int d = a;
		
		int count = 0;
		
		while (true) {
			b = (a%10) * 10;  
			c = ((a/10) + (a % 10)) % 10; 
			a = b + c;
			
			count += 1;
			
			if(a == d) {
				break;
			}
		}
		System.out.println(count);
	}

}


