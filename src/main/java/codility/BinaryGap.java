package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    private static final int FIRST = 0;

    public static int solution(int decimal) {
        return findGap(decimal);
    }

    public static List<Integer> decToBin(int decimal) {
        List<Integer> binary = new ArrayList<>();
        while (decimal != 1) {
            for (int divider = 0; divider < 2; divider++) {
                if (decimal % 2 == divider) {
                    decimal = decimal / 2;
                    binary.add(FIRST, divider);
                    break;
                }
            }
        }
        binary.add(FIRST, 1);
        return binary;
    }

    public static int findGap(int decimal) {
        int longestGap = 0;
        int gapCount = 0;
        List<Integer> binary = decToBin(decimal);
        for (int bit : binary) {
            if (bit == 1) {
                if (longestGap < gapCount) {
                    longestGap = gapCount;
                }
                gapCount = 0;
                continue;
            }
            gapCount++;
        }
        return longestGap;
    }
}
