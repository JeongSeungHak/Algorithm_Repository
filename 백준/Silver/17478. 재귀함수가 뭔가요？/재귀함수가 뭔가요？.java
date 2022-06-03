import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String str0 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
        
        System.out.println(str0);

        Funciton(count, 0);

    }

    public static void Funciton(int n, int m){
        String str2 = "\"재귀함수가 뭔가요?\"";
        String str3 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        String str4 = "라고 답변하였지.";
        String str5 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String str6 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String str7 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        int ub = m;

        if(n == 0) {
            Underbar(ub);
            System.out.println(str2);
            Underbar(ub);
            System.out.println(str3);
            Underbar(ub);
            System.out.println(str4);
            return;
        }
        else {
            Underbar(ub);
            System.out.println(str2);
            Underbar(ub);
            System.out.println(str5);
            Underbar(ub);
            System.out.println(str6);
            Underbar(ub);
            System.out.println(str7);
        }

        ub ++;
        Funciton(n -1, ub);
        Underbar(ub - 1);
        System.out.println(str4);

    }

    public static void Underbar(int a){
        for(int i = 0; i < a; i++) {
            System.out.print("____");
        }
    }
}
