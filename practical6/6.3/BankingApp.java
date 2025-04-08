// Write a small application in Java to develop Banking Application in which user
// deposits the amount Rs 1000.00 and then start withdrawing ofRs 400.00, Rs 300.00
// and it throws exception "Not Sufficient Fund" when user withdraws Rs 500 thereafter

import java.util.Scanner;

class BankingApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 1000.");
        int amount = 1000;

        try{

            while (true){
                System.out.print("Withdraw Some money: ");
                int deposit = sc.nextInt();
                
                if (amount-deposit >= 0){
                    amount-=deposit;
                    System.out.println("Now you have "+ amount);
                }
                else{
                    throw new Exception("Not efficient money!");
                }
                System.out.print("Again, ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
}