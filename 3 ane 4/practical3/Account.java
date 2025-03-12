// Create a class Account. It has three data member account id, name and balance.
// Define function to assign value and display value. Define function that search account
// number given by the user. If account number exists, print detail of that account. Write
// a program using array of object. Declare at least 5 account and print details.

public class Account {
    int aid;
    String name;
    double balance;

    Account(int aid, String name, double balance){
        this.name = name;
        this.aid = aid;
        this.balance = balance;
    }

    public String toString(){
        return "Account id is: " + this.aid + "\nName is " + this.name + "\naccount balance is: " + this.balance;
    }
}
