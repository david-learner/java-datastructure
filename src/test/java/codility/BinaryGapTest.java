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
        List<Integer> binary2 = Arrays.asList(1, 0, 0, 1, 0, 0, 0);
        List<Integer> binary3 = Arrays.asList(1, 0, 0, 1, 0, 0, 0, 1);
        assertThat(BinaryGap.decToBin(9), is(binary));
        assertThat(BinaryGap.decToBin(72), is(binary2));
        assertThat(BinaryGap.decToBin(145), is(binary3));
    }

    @Test
    public void findGap() {
        assertThat(BinaryGap.findGap(9), is(2));
        assertThat(BinaryGap.findGap(72), is(2));
        assertThat(BinaryGap.findGap(145), is(3));
    }
}
