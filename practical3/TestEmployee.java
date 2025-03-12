import java.util.Scanner;

public class TestEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("Enter employee salary and there name: ");
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        String name = sc.nextLine();
        emp1.putData(name, salary);

        System.out.println(emp1.getData());
    }
}