package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.println("n의 값 : ");
            n = in.nextInt();
        } while(n <= 0);

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
        in.close();

        q10();
        q11();
    }

    //연습문제
    static void q10() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("a의 값 : "+a);
        System.out.println("b의 값 : "+b);

        do {
            System.out.println("a보다 큰 값을 입력하세요!");
            b = in.nextInt();
            System.out.println("b의 값 : "+b);
        } while(b <= a);

        System.out.println("b - a는 "+(b-a)+"입니다.");
        in.close();
    }

    static void q11() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int t = 10;
        int count = 0;
        do {
            a -= a % t;
            t *= 10;
            count++;
        } while(a > 0);

        System.out.println("그 수는 "+count+"자리입니다.");
        in.close();
    }
}
