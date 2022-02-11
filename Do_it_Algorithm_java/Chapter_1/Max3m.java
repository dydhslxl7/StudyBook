package Do_it_Algorithm_java.Chapter_1;

public class Max3m {

    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("max3_2(3,2,1) = " + max3(3,2,1));
        System.out.println("max3_2(3,2,2) = " + max3(3,2,2));
        System.out.println("max3_2(3,1,2) = " + max3(3,1,2));
        System.out.println("max3_2(3,2,3) = " + max3(3,2,3));
        System.out.println("max3_2(2,1,3) = " + max3(2,1,3));
        System.out.println("max3_2(3,3,2) = " + max3(3,3,2));
        System.out.println("max3_2(3,3,3) = " + max3(3,3,3));
        System.out.println("max3_2(2,2,3) = " + max3(2,2,3));
        System.out.println("max3_2(2,3,1) = " + max3(2,3,1));
        System.out.println("max3_2(2,3,2) = " + max3(2,3,2));
        System.out.println("max3_2(1,3,2) = " + max3(1,3,2));
        System.out.println("max3_2(2,3,3) = " + max3(2,3,3));
        System.out.println("max3_2(1,2,3) = " + max3(1,2,3));
    }

    // 연습문제
    // Q1
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        
        return max;
    }

    // Q2
    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        
        return min;
    }

    // Q3
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;
        
        return min;
    }
}