package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int n = in.nextInt();
        
        if(n > 0)
            System.out.println("이 수는 양수입니다.");
        else if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");

        in.close();
    }
}
