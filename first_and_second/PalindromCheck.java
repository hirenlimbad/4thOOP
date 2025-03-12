import java.util.Scanner;

class PalindromCheck {

    static String isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if ( s.charAt(i) != s.charAt(s.length()-i-1)){
                return "Not Palindrome.";
            }
        }
        return "Palindrome.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");

        String s = sc.nextLine();
        System.out.println("Your string is" + isPalindrome(s));
    }
}
