import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] arr = new int[count];
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[count - 1]);
		sc.close();

	}

}
