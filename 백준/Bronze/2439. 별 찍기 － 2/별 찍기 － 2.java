import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			for(int j = count-1; j > i; j--) {
				System.out.print(" ");
				
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
