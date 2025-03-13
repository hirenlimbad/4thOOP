public class NoZero {
    public static void main(String[] args) throws CustomException{
        if (args[0].charAt(0) == '0'){
            throw new CustomException("You entered zero.");
        }
    }
}
