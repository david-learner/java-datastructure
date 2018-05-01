package codility;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinaryGapTest {
    @Test
    public void getInput() {
        Scanner scanner = new Scanner("10");
        assertThat(scanner.nextInt(), is(10));
    }

    @Test
    public void solution() {
        assertThat(BinaryGap.solution(9), is(2));
    }

    @Test
    public void decimalToBinary() {
        List<Integer> binary = Arrays.asList(1, 0, 0, 1);
        assertThat(BinaryGap.decToBin(9), is(binary));
    }
}
