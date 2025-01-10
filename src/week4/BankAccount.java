package week4;

public class BankAccount {
    private static int nextID = 100;
    //Attributes
    private String owner;
    private double balance;
    private int account;

    //constructor
    public BankAccount(String owner, int account) {
        this.owner = owner;
        balance = 0;
        this.account = account;

    }

    public BankAccount(String owner) {
        this.owner = owner;
        balance = 0;
        this.account = nextID;
        nextID++;

    }


    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficent funds");
        }
    }

    //Print
    public String toString() {

        return owner  + " has account " + account + " with balance " + balance;
    }

}


