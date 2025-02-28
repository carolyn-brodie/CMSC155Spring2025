package week7.companyFinance;

public class PayrollTester {
    public static void main(String[] args) {
        Pay nine_month_employee = new Pay("faculty", 50000);
        Pay twelve_month_employee = new Pay("staff", 50000);
        Pay hourly_employee = new Pay("hourly", 25);
        System.out.println(nine_month_employee + "\n" +twelve_month_employee + "\n" +
                hourly_employee);
    }
}
