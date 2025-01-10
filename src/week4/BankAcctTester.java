package week4;

public class BankAcctTester {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Tommy", 567);
        System.out.println(acct);
        BankAccount suzyAcct = new BankAccount("Suzzy");
        System.out.println(suzyAcct);
    }
}