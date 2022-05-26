import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int b = 0;
		int c = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(b < arr[i]) {
				b = arr[i];
				c = i + 1;
			}
		}
		
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}

}
