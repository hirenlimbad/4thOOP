import Employee;

package practical4;
public class HRDepartment {
    public static void main(String[] args) {
        Employee emp = new Employee("Hiren", "Rajkot", 15000, "Developer.");
        System.out.println(emp);
        emp.walk();
    }
}
