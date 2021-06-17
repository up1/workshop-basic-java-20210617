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

}
