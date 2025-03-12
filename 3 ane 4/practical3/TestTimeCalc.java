

public class TestTimeCalc {
    public static void main(String[] args) {
        TimeCalc t1 = new TimeCalc();
        TimeCalc t2 = new TimeCalc();
        TimeCalc t3 = new TimeCalc();
        t1.setTime(5, 50);
        t2.setTime(5, 70);

        t3.sum(t1, t2);
        System.out.println(t3);
    }
}