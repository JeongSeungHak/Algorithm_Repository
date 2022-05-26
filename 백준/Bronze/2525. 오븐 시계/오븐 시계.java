import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int needTime = sc.nextInt();
		
		hh += needTime / 60;
		mm += needTime % 60;
		
		if(mm >= 60) {
			hh += 1;
			mm -= 60;
		}
		
		if(hh >= 24) {
			hh -= 24;
		}
		
		System.out.println(hh + " " + mm);
		
	}

}
