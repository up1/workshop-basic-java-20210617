public class Employee {
    // Properties or states
    private int id;
    private String fname;
    private String lname;
    private Department dep;
    private String pos;

    // Constructor
    public Employee() {
        this("?", "?");
    }

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    // Behaviors or methods
    public String getFullName() {
        return fname + " : " + lname;
    }

    String getPositionName() {
        return "";
    }
}
