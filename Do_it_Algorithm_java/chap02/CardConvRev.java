package Do_it_Algorithm_java.chap02;

import java.util.Scanner;
// 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄

public class CardConvRev {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 변환합니다.
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHHIJKLMOPQRSTUVWXYZ";
        
        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }
    
}
