import java.util.Scanner;

public class TestCartesianPoint {

    public static void helper(CartesianPoint obj){
        System.out.print("\nNow cspt object value   ");
        obj.display();
    }

    public static void main(String[] args) {
        CartesianPoint cspt_with_x = new CartesianPoint(5);
        CartesianPoint cspt_with_y = new CartesianPoint(5, 0.5f);
        CartesianPoint cspt = new CartesianPoint(5, 5);

        cspt_with_x.display();
        cspt_with_y.display();
        cspt.display();


        System.out.print("--------Using the methods using cspt object------ \nprovide the x and y value that you wanna change: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        cspt.move(x, y);
        helper(cspt);

        System.out.print("give me x value to move the x axes : ");
        x = sc.nextInt();
        cspt.moveX(x);
        helper(cspt);

        System.out.print("give me y value to move the y axes : ");
        y = sc.nextInt();
        cspt.moveY(y);
        helper(cspt);
    }
}
