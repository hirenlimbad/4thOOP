public class Main {
    public static void main(String[] args) {
        int tri = new Triangle(10, 10, 10).area();
        int r1 = new Rectangle(40, 30).area();
        int c1 = new Circle(3).area();

        System.out.println("Triangle area: " + tri);
        System.out.println("Rectangle area: " + r1);
        System.out.println("Circle area: " + c1);
    }
}
