package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = in.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
        in.close();
    }

    // 연습문제
    // Q7
    public static String q7(int n) {
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
            sb.append(i);
            if(i != n)
                sb.append(" + ");
            else
                sb.append(" = "+sum);
        }
        return new String(sb);
    }

    // Q8
    static int gauss(int n) {
        int sum = 0;

        if(n % 2 == 0)
        {
            sum = (1 + n) * (n / 2);
        }
        else
        {
            sum = (1 + (n-1)) * ((n-1) / 2) + n;
        }

        return sum;
    }

    // Q9
    static int sumof(int a, int b) {
        int start, end;
        if(a >= b)
        {
            end = a;
            start = b;
        }
        else
        { 
            start = a;
            end = b;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}