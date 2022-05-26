import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        double[] arr = new double[count];
        int max = 0;
        double sum = 0;
        double changeValue = 0;

        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];

            if(arr[i] > max) {
                max = (int)arr[i];
            }

        }
        
        //최고점수 기준으로 다른과목 점수 변환
        for(int i = 0; i < count; i++) {
            arr[i] = arr[i]/max*100;
            changeValue += arr[i];
        }

        System.out.println(changeValue/count);

    }
}
