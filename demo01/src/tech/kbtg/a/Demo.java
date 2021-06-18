package tech.kbtg.a;

public class Demo {

    public static int count = 20;

    // Constant
    public static final int XYZ = 1234;

    public static void main(String... args) {
        System.out.println("Before: " + count);
        Other other1 = new Other();
        other1.todo();
        Other other2 = new Other();
        other2.todo();
        System.out.println("After: " + count);
    }

}

class Other {
    void todo() {
        Demo.count = 10;
    }
}
