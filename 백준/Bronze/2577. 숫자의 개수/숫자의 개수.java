import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a * b * c;

		String str = Integer.toString(d);
		
		
		for(int i = 0; i < 10; i++) {
            int x = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) { // char->int 변환시 아스키코드로 출력됨 '0' (48)을 빼주면 정수가 된다.
					x += 1;
				}
			}	
			System.out.println(x);
		}

	}

}
