import java.util.Scanner;

public class TestTimeCalc {
    public static void main(String[] args) {
        TimeCalc t1 = new TimeCalc();
        TimeCalc t2 = new TimeCalc();
        TimeCalc t3 = new TimeCalc();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours and minites for t1: ");
        
        t1.setTime(sc.nextInt(), sc.nextInt());

        System.out.print("Enter the hours and minites for t2: ");
        t2.setTime(sc.nextInt(), sc.nextInt());

        t3.sum(t1, t2);
        System.out.println(t3);
    }
}