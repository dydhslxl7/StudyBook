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
            switch (menu) 
            {
                case 1:     // 푸시
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:     // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:     // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:     // 덤프
                    s.dump();
                    break;

                // Q1
                case 5:     // 클리어
                    s.clear();
                    System.out.println("스택을 비웠습니다.");
                    break;

                case 6:     // 이즈풀
                    if(s.isFull())
                        System.out.println("가득 찼습니다.");
                    else
                        System.out.println("가득 차지 않았습니다.");
                    break;

                
            }
        }

        stdIn.close();
    }
}
