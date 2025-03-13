import java.util.Scanner;

public class TestException {

    static void error() throws Exception{
        throw new Exception("function throwed error.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Which exeption you want ? 1) arithmatic, 2) all exption class (parent expetion class), 3) funtion throwing exption? 4) intetionally throw. ");
        int choise = sc.nextInt();
        

        if (choise == 3){
            try{
                try{
                    error();
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        try{
            if (choise == 1){
                int test = 1/0;
            }
            if (choise == 2){
                int arr[] =  new int[2];
                int b = arr[10];
            }
            if (choise == 4){
                throw new MyExeption("Kem bhaii ? kaii takleef chhe ?");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (MyExeption e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Game teh kari lo..hun toh run thaisj.");
        }
    }
}
