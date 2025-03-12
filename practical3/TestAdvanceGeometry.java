import java.util.Scanner;

public class TestAdvanceGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.print("Enter the value of x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point ag1 = new Point();
        Point ag2 = new Point(x, y);
        Point ag3 = new Point(ag2);

        System.out.println( "Using default const: "+ ag1 + "using parameterized: "  + ag2 + "using copy: " + ag3);
    }
}
