import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 1;

        if(a == 0) {
            System.out.println(1);
        }
        else{
            for(int i = 1; i <= a; i++) {
                b *= i;
            }
            System.out.println(b);
        }

    }
}
