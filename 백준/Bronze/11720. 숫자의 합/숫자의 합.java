import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str1 = sc.next();
        int a = 0;

        for(int i = 0; i < count; i++) {
            a += str1.charAt(i) - '0';
        }

        System.out.println(a);
        
    }
}
