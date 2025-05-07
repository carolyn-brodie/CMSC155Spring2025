package tryLambdas;

import java.util.function.Function;

public class LambdaFunc1 {

    public static int sumOfAnything(Function<Integer,Integer> func, int n) {
        int total = 0;
        for (int count = 0; count <= n; count++) {
            total += func.apply(count);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAnything(x->x, 2));      //returns 3
        System.out.println(sumOfAnything(x->x * x, 2));     //returns 5
        System.out.println(sumOfAnything(x->x*x*x, 2));    //returns 9

    }

}
