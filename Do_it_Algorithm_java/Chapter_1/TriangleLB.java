package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n;

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        // do {
        //     System.out.print("몇 단 삼각형입니까? : ");
        //     n = in.nextInt();
        // } while (n <= 0);

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // in.close();

        // triangleLU(5);
        // triangleRU(5);
        // triangleRB(5);
        // spira(4);
        npira(4);
    }

    // 연습문제
    // 왼쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.println("몇 단 삼각형입니까? : "+n);
        } while (n <= 0);

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // 오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.println("몇 단 삼각형입니까? : "+n);
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i < j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    // 오른쪽 아래가 직각인 이등변 삼각형을 출력
    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.println("몇 단 삼각형입니까? : "+n);
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if(i >= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        int last_n = (n-1) * 2 + 1;

        int n1, space;
        for (int i = 1; i <= n; i++) {
            n1 = (i-1) * 2 + 1;
            space = ( last_n - n1 ) / 2;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ing
    static void npira(int n) {
        int count = 1;
        int last_n = n * 2 + 1;
        int n1 = 0;
        int space;
        do {
            if(count % 2 == 0)
            {
                System.out.println();
            }
            else
            {
                n1++;
                space = ( last_n - n1 ) / 2;
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n1; j++) {
                    System.out.print(n1);
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
            }
            count++;
        } while(n1 <= n);
    }
}
