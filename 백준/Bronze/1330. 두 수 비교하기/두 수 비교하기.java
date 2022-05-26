import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String s1 = a.substring(0, a.indexOf(" ")).trim();
		String s2 = a.substring(a.lastIndexOf(" ")).trim();
		
		int b = Integer.parseInt(s1);
		int c = Integer.parseInt(s2);
		
		if(b > c) {
			System.out.println(">");
		}
		else if(b < c) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		

	}

}
