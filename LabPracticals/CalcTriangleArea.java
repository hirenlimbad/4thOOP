import java.util.Scanner;

public class CalcTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate the area of an triangle write length of 3 sides: ");
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();
        double s = (a+b+c) / 2;
        double ans = Math.sqrt(s * (s-a) * (s-b) *(s-c));
        System.out.println(ans);
    }
}
