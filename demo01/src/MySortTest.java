import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    @DisplayName("Empty list should be sorted")
    public void case01() {
        List<Integer> expected = Arrays.asList();
        MySort mySort = new MySort();
        List<Integer> inputs = Arrays.asList();
        List<Integer> results = mySort.sort(inputs);
        assertEquals(expected, results);
    }

    @Test
    @DisplayName("[1,2] => [1,2]")
    public void case02() {
        List<Integer> expected = Arrays.asList(1,2);
        MySort mySort = new MySort();
        List<Integer> inputs = Arrays.asList(1,2);
        List<Integer> results = mySort.sort(inputs);
        assertEquals(expected, results);
    }

    @Test
    @DisplayName("[2,1] => [1,2]")
    public void case03() {
        List<Integer> expected = Arrays.asList(1,2,3,4);
        List<Integer> inputs = Arrays.asList(2,1,6,8);

        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        List<Integer> expect = new ArrayList<>();
        expect.add(2);
        expect.add(1);

        asList();
        asList(1);
        asList(1, 2);
        asList(1, 2, 3);

    }

    private List<Integer> asList(Integer... inputs) {
        List<Integer> results = new ArrayList<>();
        for (Integer input : inputs) {
            results.add(input);
        }
        return results;
    }

}