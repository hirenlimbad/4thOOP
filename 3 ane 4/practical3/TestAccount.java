import java.util.Scanner;

public class TestAccount {
    
    public static void main(String[] args) {
        Account acccounts[] = new Account[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.print("Enter the account id, balance and the name : ");
            int id = sc.nextInt();
            int balance = sc.nextInt();
            String name = sc.nextLine();
            acccounts[i] = new Account(id, name, balance);
        }

        System.out.print("Enter the account number you wanna search : ");
        int x = sc.nextInt();

        for (int i = 0; i<5; i++){
            if (acccounts[i].aid == x ){
                System.out.println(acccounts[i]);
            }
        }
    }

}
