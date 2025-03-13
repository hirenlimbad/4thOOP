import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reg_id[] = new int[5];
        double marks[] = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the reg id and marks : ");
            reg_id[i] = sc.nextInt();
            marks[i] = sc.nextDouble();
        }
        String res = "";
        for (int i = 0; i < 5; i++) {
            try {
                if (marks[i] < 0) {
                    throw new IllegalMarkException("Illegal Mark");
                }
                if (marks[i] >= 40.0) {
                    res = "pass";
                } else {
                    res = "fail";
                }
                System.out.println(res);
            } catch (IllegalMarkException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
