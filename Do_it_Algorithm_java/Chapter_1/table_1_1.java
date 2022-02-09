package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class table_1_1 {

    // 세 값의 최댓값
    public static void max3_1(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : ");  int a = stdIn.nextInt();
        System.out.println("b의 값 : ");  int b = stdIn.nextInt();
        System.out.println("c의 값 : ");  int c = stdIn.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }

    static int max3_2(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("max3_2(3,2,1) = " + max3_2(3,2,1));
        System.out.println("max3_2(3,2,2) = " + max3_2(3,2,2));
        System.out.println("max3_2(3,1,2) = " + max3_2(3,1,2));
        System.out.println("max3_2(3,2,3) = " + max3_2(3,2,3));
        System.out.println("max3_2(2,1,3) = " + max3_2(2,1,3));
        System.out.println("max3_2(3,3,2) = " + max3_2(3,3,2));
        System.out.println("max3_2(3,3,3) = " + max3_2(3,3,3));
        System.out.println("max3_2(2,2,3) = " + max3_2(2,2,3));
        System.out.println("max3_2(2,3,1) = " + max3_2(2,3,1));
        System.out.println("max3_2(2,3,2) = " + max3_2(2,3,2));
        System.out.println("max3_2(1,3,2) = " + max3_2(1,3,2));
        System.out.println("max3_2(2,3,3) = " + max3_2(2,3,3));
        System.out.println("max3_2(1,2,3) = " + max3_2(1,2,3));
    }
}