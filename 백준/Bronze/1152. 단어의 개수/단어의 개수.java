import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine().trim();
		
		if(str1.isEmpty() == false) {
			String[] s1 = str1.split(" ");
			
			System.out.println(s1.length);
		}
        else {
			System.out.println(0);
		}

	}

}
