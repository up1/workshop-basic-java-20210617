public class MyRange {

    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }
}
