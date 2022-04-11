package Do_it_Algorithm_java.chap03;

import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch로 이진 검색

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];         // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");    // 배열의 첫 요소를 먼저 입력합니다.
        x[0] = stdIn.nextInt();
    }
}
