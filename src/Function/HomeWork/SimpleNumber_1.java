package Function.HomeWork;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1) С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer> (да нужно
 * вспоминать и предыдущую лекцию ☺) реализуйте функцию которая вернет количество простых
 * чисел в массиве целых чисел. Например [5,6,7,8,9,10] => 2
 */

public class SimpleNumber_1 {
    public static void main(String[] args) {

        Integer [] inMass={5,6,7,8,9,10};
        Predicate<Integer> predicate=a->{
            BigInteger bigInteger=BigInteger.valueOf(a);
            return bigInteger.isProbablePrime((int) Math.log(a));
        };

        Function<Integer [],Integer> fun=a->{
            int incr = 0;
            for (int i:a){
                if (predicate.test(i)) incr++;
            }
            return incr;
        };
        System.out.println(fun.apply(inMass));;

    }
}
