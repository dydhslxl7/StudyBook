package Do_it_Algorithm_java.chap02;

import java.util.Random;

public class ReverseArray_Q2 {

    static void reserve(int[] num) {
        int len = num.length;
        int temp;
        for (int i = 0; i < (len / 2); i++) {
            System.out.println("a["+ i +"]과(와) a["+ (len-i-1) +"]를 교환합니다.");
            
            temp = num[i];
            num[i] = num[(len-i-1)];
            num[(len-i-1)] = temp;
            
            for (int j : num) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();

        int n = rd.nextInt(5) + 1;
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = rd.nextInt(100) + 1;
        }

        for (int j : num) {
            System.out.print(j+" ");
        }
        System.out.println();

        reserve(num);

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
