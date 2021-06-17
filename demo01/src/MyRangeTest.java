import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    public void startWithInclude() { // [
        MyRange myRange = new MyRange("[1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude() { // [
        MyRange myRange = new MyRange("(1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertFalse(isInclude);
    }

}