import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        if(count == 0) {
            System.out.println(0);
        }
        else if(count == 1) {
            System.out.println(1);
        }
        else if(count <= 20) {
            int[] arr = new int[count + 1];

            arr[0] = 0;
            arr[1] = 1;

            int result = 0;

            for(int i = 2; i <= count; i++){
                arr[i] = arr[i-2] + arr[i-1];
                result = arr[i];
            }
            System.out.println(result);
        }

    }
}
