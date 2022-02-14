package Do_it_Algorithm_java.Chapter_1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.println("입력 : ");
            no = in.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수 no의 값은 "+no+"가(이) 되었습니다.");
        in.close();
    }
}
