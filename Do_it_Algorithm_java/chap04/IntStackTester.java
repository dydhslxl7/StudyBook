package Do_it_Algorithm_java.chap04;

import java.util.Scanner;
// int형 스택의 사용 예

class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);  // 최대 64개를 푸시할 수 있는 스택
        
        while(true) 
        {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)종료");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            
        }

        stdIn.close();
    }
}
