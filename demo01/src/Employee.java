public class Employee {
    // Properties or states
    private int id;
    private String fname;
    private String lname;
    //    Department dep;
    private String pos;

    // Constructor
    public Employee() {
        this("?", "?");
    }

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFullName() {
        return fname + " : " + lname;
    }

    String getPositionName() {
        return "";
    }
}
