import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int a = sc.nextInt();
			String str1 = sc.next();
			
			for(int j = 0; j < str1.length(); j++) {
				char str2 = str1.charAt(j);
				
				for(int k = 0; k < a; k++) {
					System.out.print(str2);
				}
				
			}
            System.out.println();
			
		}
		
		sc.close();
		
	}

}
