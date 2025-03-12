package practical4;
public class Triangle extends Shape {
    public void display_area() {
        double area = 0.5 * height * width;
        System.out.println("Area of Triangle: " + area);
    }
}
