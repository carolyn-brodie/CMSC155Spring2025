package week6;

public class SavingsAccount extends BankAccount{

    //Notice this is no longer static
    private double interestRate = .1;

    public SavingsAccount(String owner, double interest) {
        super(owner);
        interestRate = interest;
    }
    public void something() {
        System.out.println("something");

    }
    @Override
    public String toString() {
        String out = super.toString();
        out +=  "with interest rate " + interestRate;
        return out;
    }


}
