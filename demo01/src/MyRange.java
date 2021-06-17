import java.util.ArrayList;
import java.util.List;

public class MyRange {

    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public int getFirstNumber() {
        int firstNumber = Character.getNumericValue(input.charAt(1));
        if( checkStartWithInclude() ) {
            return firstNumber;
        }
        return firstNumber + 1;
//        return input.charAt(1) - 48;

    }

    public String getResult() {
        int firstNumber = getFirstNumber();
        int secondNumber = 5;
//        String[] results = new String[secondNumber - firstNumber + 1];
        // Collection Framework
        List<String> results = new ArrayList<>();
        for (int i = firstNumber; i < secondNumber + 1 ; i++) {
            results.add(String.valueOf(i));
        }
        return String.join(",", results);
    }
}
