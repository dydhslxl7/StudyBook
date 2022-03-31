package Do_it_Algorithm_java.chap03;

import java.util.Arrays;
import java.util.Scanner;
// 선형 검색 (보초법)

public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;                 // 보초를 추가

        while(true) {
            if(a[i] == key)         // 검색 성공!
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];         // 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");   // 키 값을 입력
        int ky = stdIn.nextInt();

        // int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색
        int idx = q2(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if(idx == -1)
        {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else
        {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

        stdIn.close();
    }

    static int q1(int[] a, int n, int key) {

        a[n] = key;                 // 보초를 추가

        int i;
        for(i = 0; i < n; i++) {
            if(a[i] == key)         // 검색 성공!
                break;
        }
        return i == n ? -1 : i;
    }

    static int q2(int[] a, int n, int key) {

        // 기존 코드 유지하기 위해 낭비지만 추가
        a = Arrays.copyOfRange(a, 0, n);

        System.out.print("   |");
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%3d", i);
        }

        System.out.println("\n---+----------------------");

        int i;
        for(i = 0; i < n; i++) {
            System.out.printf("   |");
            for (int j = 0; j < i+1; j++) {
                if(j != i)
                    System.out.printf("   ");
                else
                    System.out.printf("%3s", "*");
            }
            System.out.println();
            System.out.printf("%3d|", i);
            for (int j : a) {
                System.out.printf("%3d", j);
            }
            System.out.println();
            if(a[i] == key)         // 검색 성공!
                break;
        }
        return i == n ? -1 : i;
    }
}
