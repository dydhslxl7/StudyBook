package Do_it_Algorithm_java.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    // 배열 a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];    
        }

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = in.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            // nextInt(n) : 0 ~ (n-1)
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]" + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

        in.close();
    }

    // 연습문제
    static void q1(Random rand) {
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        // 사람 수도 난수로 생성하도록
        int num = rand.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            // nextInt(n) : 0 ~ (n-1)
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]" + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
