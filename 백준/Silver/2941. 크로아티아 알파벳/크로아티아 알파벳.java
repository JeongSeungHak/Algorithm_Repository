import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next().toString();

		int count = 0;
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.contains("c=")) {
				count ++;
				str1 = str1.replaceFirst("c=", " ");
				continue;
			} 
			if(str1.contains("c-")) {
				count ++;
				str1 = str1.replaceFirst("c-", " ");
				continue;
			} 
			if(str1.contains("dz=")) {
				count ++;
				str1 = str1.replaceFirst("dz=", " ");
				continue;
			} 
			if(str1.contains("d-")) {
				count ++;
				str1 = str1.replaceFirst("d-", " ");
				continue;
			}
			if(str1.contains("lj")) {
				count ++;
				str1 = str1.replaceFirst("lj", " ");
				continue;
			}
			if(str1.contains("nj")) {
				count ++;
				str1 = str1.replaceFirst("nj", " ");
				continue;
			}
			if(str1.contains("s=")) {
				count ++;
				str1 = str1.replaceFirst("s=", " ");
				continue;
			}
			if(str1.contains("z=")) {
				count ++;
				str1 = str1.replaceFirst("z=", " ");
				continue;
			}
		}			
		int b = str1.replace(" ", "").length();
		System.out.println(count + b);
	}

}
