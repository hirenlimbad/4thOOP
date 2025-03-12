package practical4;
// A set of 5 words (strings) will be taken as command line arguments. Write a program
// to reverse each word and check whether it is palindrome or not using method.

public class StringReversal {

    static String reverse(String s){ 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r; 
        }
        return r;
    }

    static void checkPalindrom(String s){
        if (reverse(s).equals(s)){
            System.out.println("String " + s + " is palindrome");
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<args.length; i++){
            checkPalindrom(args[i]);
        }
    }
}
