package Do_it_Algorithm_java.chap03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearch {
    // 신체검사 데이터를 정의합니다.
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }

        // 문자열을 반환하는 메서드(정보 확인용)
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
}