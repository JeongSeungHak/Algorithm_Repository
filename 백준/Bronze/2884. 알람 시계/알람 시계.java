import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String s1 = str.substring(0, str.indexOf(" ")).trim();
		String s2 = str.substring(str.lastIndexOf(" ")).trim();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		if(a == 0 && b < 45) {
			a = 23;
			b += 60;
		}
		
		int c = ((a * 60) + b) - 45;
		int d = c / 60;
		int e = c % 60;
		
		System.out.println(d + " " + e);
		
	}
}
