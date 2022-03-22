package Do_it_Algorithm_java.chap02;

import java.util.Scanner;
// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함

public class PhysicalExamination {
    
    static final int VMAX = 21;     // 시력 분포(0.0에서 0.1 단위로 21개)

    static class PhyscData {
        String name;    // 이름
        int height;     // 키
        double vision;  // 시력

        // 생성자
        PhyscData(String name, int height, double vision)
        {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 키의 평균값을 구함
        static double aveHeight(PhyscData[] dat)
        {
            double sum = 0;

            for (int i = 0; i < dat.length; i++)
            {
                sum += dat[i].height;
            }

            return sum / dat.length;
        }
    }
}
