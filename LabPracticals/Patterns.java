public class Patterns {

    public static void pattern1(){
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        int counter = 1;
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter%10);
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void pattern4(int n){
        int stars = -1;
        for (int i = 0; i < 4 ; i++) {
            stars += 2;
            for (int j = 2-i; j >=0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            stars -= 2;
            for (int j=0; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4(20);
    }
}
