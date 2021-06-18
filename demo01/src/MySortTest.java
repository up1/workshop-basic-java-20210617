import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}