package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = in.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n)
        {
            sum += i;
            i++;
        }

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
        in.close();
    }

    // 연습문제 - Q6
    public String q6(int n) {
        int i = 1;
        
        while(i <= n)
        {
            i++;
        }
        return "변수 i의 값은 "+i+"입니다.";
    }
}
