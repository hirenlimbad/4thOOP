import java.util.Scanner;
public class DivisionKiError {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            if (b == 0){
                throw new DivisionExeption( "Ainstein bhi zero se divide nahi karr paya tha..." );
            }
        }

        catch (DivisionExeption  e){
            System.out.println(e);
        }
    }
}