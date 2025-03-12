import java.util.Scanner;

import practical4.Human;

public class EmployeetTest {
    public static void main(String[] args) {
        Human emp1 = new Human();
        Human emp2 = new Human();
        System.out.println("Enter your 2 employee salary and there name: ");
        
        Scanner sc = new Scanner(System.in);
        
        int salary = sc.nextInt();
        String name = sc.nextLine();
        emp1.putData(name, salary);

        salary = sc.nextInt();
        name = sc.nextLine();
        emp2.putData(name, salary);

        System.out.println(emp1 + "\n" +  emp2);
    }
}
