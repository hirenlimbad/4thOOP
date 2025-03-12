public class TestResult {
    public static void main(String[] args) {
        Result res = new Result();
        int avg_marks = 60;

        if (res.pass(avg_marks)){
            System.out.println("Congrats you cleared this exam.");
            System.out.println("Your div is: " + res.division(avg_marks));
        }
    }
}
