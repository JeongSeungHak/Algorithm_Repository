import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int[] strArr1 = new int[3];
		int[] strArr2 = new int[3];
		
		String s1 = "";
		String s2 = "";
		
		for(int i = 0; i < str1.length(); i++) {
			strArr1[i] = str1.charAt(i) - '0';
			strArr2[i] = str2.charAt(i) - '0';
		}
		
		for(int m = 2; m >= 0; m--) {
			s1 += strArr1[m];
			s2 += strArr2[m];
		}
		
		if(Integer.parseInt(s1) > Integer.parseInt(s2)) {
			System.out.println(s1);			
		}
		else {
			System.out.println(s2);
		}

	}

}
