
public class test {
    static double average(String args[]) throws NullPointerException, NumberFormatException{
        if (args == null){
            throw new NullPointerException("Null values chhe jovo toh khari.");
        }
        double result = 0;
        try{
            for (int i = 0; i<args.length; i++){
                result += Double.parseDouble(args[i]);
            }
            return result / args.length;
        }

        catch (Exception e){
            throw new NumberFormatException("Mota bhai double number fill karo.");
        }
    }

    public static void main(String[] args) {

        try{
            double ans = average(args);
            System.out.println("Average is : " + ans);
        }
        catch (NullPointerException e){
            System.out.println("Please provide the numbers in cmd arguements.");
        }
        catch (NumberFormatException e){
            System.out.println("Only Numbers pls.");
        }
    }
}
