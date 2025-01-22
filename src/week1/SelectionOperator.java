package week1;

public class SelectionOperator {
    public static void main(String[] args) {
        int x = 6;
        int y = 0;
        //Selection Operator
        y = x >= 0 ? x : -x;

        System.out.println("y is " + y);


//This is equivalent to the code above
        y = 0;

        if (x >= 0)
            y = x;
        else
            y = -x;

        System.out.println("y is " + y);

    }
}
