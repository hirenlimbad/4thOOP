import java.util.ArrayList;

public class myStringBuilder {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 555);
        list.remove(3);
        System.out.println(list);
    }
}