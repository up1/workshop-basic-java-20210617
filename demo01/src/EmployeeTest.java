import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    @DisplayName("เมืื่อทำการสร้าง employee ด้วย default constructor " +
            "จะต้องได้ fullname = ':'")
    public void case01() {
        String expectedResult = " : ";
        Employee demo = new Employee();
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("เมืื่อทำการสร้าง employee ด้วย somkiat pui " +
            "จะต้องได้ fullname = 'somkiat : pui'")
    public void case02() {
        String expectedResult = "somkiat : pui";
        Employee demo = new Employee("somkiat", "pui");
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult, actualResult);
    }

}