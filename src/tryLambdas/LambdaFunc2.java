package tryLambdas;

import java.util.function.Function;

public class LambdaFunc2 {
    public static void func1(Function<Integer,Double> anyFunc) {
        System.out.println("Inside");
        System.out.println(anyFunc.apply(5));

    }

    public static void main(String[] args) {
        func1((x)->(double)x+5);


        func1((x)-> {
            return Math.sqrt(x);
        });

        func1((x)-> Math.sqrt(x));
        func1(Math::sqrt);
    }

}
