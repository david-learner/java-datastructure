package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryGap {
    private static final int FIRST = 0;

    public static int solution(int decimal) {
        return 2;
    }

    public static List<Integer> decToBin(int decimal) {
        List<Integer> binary = new ArrayList<>();
        while (decimal != 1) {
            if (decimal % 2 == 1) {
                decimal = decimal / 2;
                binary.add(FIRST, 1);
                continue;
            }
            if (decimal % 2 == 0) {
                decimal = decimal / 2;
                binary.add(FIRST, 0);
            }
        }
        binary.add(FIRST, 1);
        return binary;
    }
}
