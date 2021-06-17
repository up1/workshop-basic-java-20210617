import java.util.*;

public class DemoCollectionFramework {

    public static void main(String[] args) {
        // Map
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee("f1","l1"));
        employeeMap.put(2, new Employee("f2","l2"));
        employeeMap.put(15, new Employee("f15","l15"));

        Employee employee = employeeMap.get(15);
        System.out.println(employee.getFullName());

        // Iterate
        Set<Integer> keys = employeeMap.keySet();
        for (Integer key : keys) {
            Employee e = employeeMap.get(key);
            System.out.println("Data => " + e.getFullName());
        }

        // List
        List<String> users = new ArrayList<>();
        users.add("Somkiat");
        users.add("123");

        for (String user : users) {
            System.out.println(user);
        }

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

    }

}
