package Do_it_Algorithm_java.chap02;
// 1,000 이하의 소수를 열거(버전 3)

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;

            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;

                if(n % prime[i] == 0)
                {
                    flag = true;
                    break;
                }
            }
        }
    }    
}
