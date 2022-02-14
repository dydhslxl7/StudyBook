package Do_it_Algorithm_java.Chapter_1;

public class Multi99Table {
    public static void main(String[] args) {
        // System.out.println("----- 곱셈표 -----");

        // for (int i = 1; i <= 9; i++) {
        //     for (int j = 1; j <= 9; j++) {
        //         System.out.printf("%3d", i * j);
        //     }
        //     System.out.println();
        // }
        
        q12();
    }

    //연습문제
    static void q12() {
        for (int i = 0; i <= 9; i++) {            
            for (int j = 0; j <= 9; j++) {
                if(i == 0)
                {
                    if(j == 0)
                        System.out.print("  |");
                    else
                        System.out.printf("%3d", j);
                }
                else
                {
                    if(j == 0)
                        System.out.print(" "+i+"|");
                    else
                        System.out.printf("%3d", i * j);
                }
            }
            if(i == 0)
                System.out.print("\n---+---------------------------");
            System.out.println();
        }
    }
}
