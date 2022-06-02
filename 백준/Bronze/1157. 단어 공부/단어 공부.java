import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		int[] arr = new int[26];
		
		//대문자 변환
		str1 = str1.toUpperCase();
		
		for(int i = 0; i < str1.length(); i++) {
			char str2 = str1.charAt(i);
			
			int a = str1.charAt(i) - 'A';
			if(str1.charAt(i) == str2) {
				arr[a] ++;	
			}
		}
		
		int maxIndex = 0;
		int max = -1;
		char ch = 0;
		for(int k = 0; k < arr.length; k++) {
			
			if(arr[k] > max) {
				max = arr[k];
				maxIndex = k;
				ch = (char)(k + 'A');
				 
			}
			else if(arr[k] == max) {
				ch = 63;
			}
		}
				
		System.out.println(ch);

	}

}
