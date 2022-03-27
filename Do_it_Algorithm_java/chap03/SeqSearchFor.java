package Do_it_Algorithm_java.chap03;

public class SeqSearchFor {
    // 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
    static int seqSearch(int [] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if(a[i] == key) {
                return i;   // 검색 성공! (인덱스를 반환)
            }
        }
        return -1;          // 검색 실패! (-1을 반환)
    }
}
