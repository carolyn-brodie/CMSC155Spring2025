package week7.companyFinance;

import java.util.Scanner;

public class Pay {
    private String type;
    private double salary;

    public Pay(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public double calulateMonthlySalary() {
        Scanner input = new Scanner(System.in);
        if (type.equals("faculty")) {
            return salary / 9;
        } else if (type.equals("staff")) {
            return salary / 12;
        } else {
            System.out.println("Enter hours worked: ");
            int hours = input.nextInt();
            if (hours > 40) {
                return salary * 160 + (1.5 * salary * (hours - 160));
            } else {
                return salary * hours;
            }
        }
    }

    public String toString() {
        return "Monthly pay is " + calulateMonthlySalary();
    }
}
