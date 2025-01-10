package week6;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        suzyAccount.deposit(10);
        System.out.println(suzyAccount);
        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);

        BankAccount acct2 = new BankAccount("tom", 8976, 1000);




        SavingsAccount bankVar = new SavingsAccount("Bear ", .15);
        System.out.println(bankVar);
        bankVar.something();
        BankAccount test = new SavingsAccount("name", .15);

        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(suzyAccount);
        list.add(acct2);
        list.add(bankVar);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);




    }
}
