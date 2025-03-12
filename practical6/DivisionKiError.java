
public class DivisionKiError {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
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