package tryLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TryStreams {
    public static void main(String[] args) {
//        Stream<String> song = Stream.of("gently", "down", "the", "stream");
//        song.forEach(s->System.out.println(s));

        Stream<Double> randoms = Stream.generate(Math::random).limit(100);

        Stream<Double> bigRandoms = randoms.filter(x->(x > 0.7));
        double total = bigRandoms.reduce(0.0,(n,m)-> m + n);
        System.out.println(total);

        //randoms.forEach(s->System.out.print(s + " "));
//        System.out.println();


//        List<String> l = new ArrayList(Arrays.asList("five", "two", "twenty-five"));
//        System.out.println(l);
//        Stream<String> sl = l.stream();
//        Stream longWords  = sl.filter(w->w.length() > 3);
//        longWords.forEach(s -> System.out.println(s));

    }
}
