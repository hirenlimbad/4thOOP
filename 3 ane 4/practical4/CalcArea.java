package practical4;
import java.util.Scanner;

public class CalcArea {
    static double area(double height){
        return (height * height);
    }  

    static double area(double base, double height, double multiplier){
        return multiplier * base * height;
    }

    static double area(double height, double width){
        return height * width;
    }

    static void print(double area){
        System.out.println("Area is: "  + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of area: ");
        print(area(sc.nextDouble()));

        System.out.print("Enter the 2 side of triangle: ");
        print(area(sc.nextDouble(), sc.nextDouble(), 0.5));

        System.out.print("Enter the 2 side of rectangle: ");
        print(area(sc.nextDouble(), sc.nextDouble()));

    }

    
}
