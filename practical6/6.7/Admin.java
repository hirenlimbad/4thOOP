import java.util.Scanner;
import exam.Result;
import student.Student;

public class Admin {
    public static void main(String[] args) {
        System.out.print("Enter the student id, sem and there name: ");
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(), sc.nextInt(), sc.nextLine());

        String names[] = new String[3];
        int marks[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter subject mark and name of that sub: ");
            marks[i] = sc.nextInt();
            names[i] = sc.nextLine();
        }

        Result res = new Result(marks, names, s1);
        res.generateResult();
    }
}
