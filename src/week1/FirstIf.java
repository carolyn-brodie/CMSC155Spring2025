package week1;
import java.util.*;
public class FirstIf
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0)
        {

            System.out.println("The number, " + num + ", is positive");
            System.out.println("Another line");
        }
        else if (num == 0)
        {
            System.out.println("The number, " + num + ", is equal to zero");
        }
        else
        {
            System.out.println("The number is not positive");
        }

    }
}
