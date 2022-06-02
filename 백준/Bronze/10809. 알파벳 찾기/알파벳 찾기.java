import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int j = 0; j < str1.length(); j++) {
			int a = str1.charAt(j) - 'a';
			if(arr[a] == -1) {
				arr[a] = j;				
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
