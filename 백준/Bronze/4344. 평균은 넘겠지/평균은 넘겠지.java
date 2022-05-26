import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int person = sc.nextInt();
            double arr[] = new double[person];
            double sum = 0;
            double result = 0;

            for(int j = 0; j < person; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = sum / person;

            for(int k = 0; k < arr.length; k++) {
                if(arr[k] > avg) {
                    result += 1;
                }
            }

            result = result/person*100;
            
            System.out.printf("%.3f%%\n", result);

        }
    }
}
