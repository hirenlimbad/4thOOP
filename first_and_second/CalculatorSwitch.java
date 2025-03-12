import java.util.Scanner;

public class CalculatorSwitch {
    public static float sum(float a, float b){
        return a+b;
    }
    public static float substract(float a, float b){
        return a-b;
    }

    public static float multiply(float a, float b){
        return a*b;
    }

    public static float divide(float a, float b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String opr;
        System.out.print("Enter the value for A, B - followed by space: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Which Operation whould you like to perform ? +, -, * or / ");
        opr = sc.nextLine();
        switch (opr) {
            case "+":
                System.out.println("A+B = " + sum(a, b));
                break;
            case "-":
                System.out.println("A-B = " + substract(a, b));
                break;
            
            case "*":
                System.out.println("A*B = " + multiply(a, b));
                break;
            
            case "/":
                System.out.println("A/B = " + divide(a, b));
                break;
            default:
                break;
        }
    }
    
}
