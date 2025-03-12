public class ShapeTesting {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setData(5, 3);

        Rectangle r1 = new Rectangle();
        r1.setData(4, 23);

        t1.display_area();
        r1.display_area();
    }
}
