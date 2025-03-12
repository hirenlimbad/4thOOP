package practical4;
public class BankAccount {
    double balance = 0;
    double interestRate = 5.8;
    double accountid;
    String holderName;

    void openAccount(int accid, String holderName, int intialbalance){
        accountid = accid;
        this.holderName = holderName;
        balance = intialbalance;
    }

    double getInterest(){
        return interestRate;
    }

    void deposit(int amount){
        balance += amount;
    }

    void checkBalance(){
        System.out.println("Account balance is : " + balance);
    }

    void withdraw(int amount){
        if (balance-amount < 0){
            System.out.println("Insufficient balance to withdraw.");
            return;
        }
        balance-= amount;
        System.out.println("Withdraw successfull.");
    }

    void calInterest(int amount, int time){
        System.out.println("you will get : " +  ((amount * getInterest() * time) / 100 ) + " after " + time + " year.");
    }
}
