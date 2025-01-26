package week2;

public class FlexibleFor {
    public static void main(String[] args) {
        for (int count = 1; count < 30; count *= 2)
            System.out.print(count + " ");
        // count = 1, then 2, then 4, then 8, etc
        System.out.println(); // new line

        for (int count = 20; count >= 15; count--)
            System.out.print(count  + " ");
        // count DECREASES
        System.out.println();
//
        for (double count = 1.1; count < 10; count = count + 2.7)
            System.out.print(count + " ");
//        // count is a floating point variable

    }
}
