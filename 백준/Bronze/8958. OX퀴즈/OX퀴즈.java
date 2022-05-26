import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            String str1 = sc.next();
            int result = 0;
            int point = 0;

            for(int j = 0; j < str1.length(); j++) {

                if((str1.charAt(j)) == 'O'){
                    point += 1;
                }
                else if ((str1.charAt(j)) == 'X'){
                    point = 0;
                }
                result += point;
            }
            System.out.println(result);
        }

    }

}
