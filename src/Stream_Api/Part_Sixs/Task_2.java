package Stream_Api.Part_Sixs;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Используя reduce верните произведение элементов потока полученных на основании списка целых
 * чисел.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> streamList=Stream.generate(()-> (int)((Math.random()*20+1)+10)).limit(4).collect(Collectors.toList());

        streamList.forEach(System.out::println);

        BiFunction<Integer,Integer,Integer> biFunc=((a,b)->a*b);
        BinaryOperator<Integer> biOper=(a,b)->a*b;

        Integer reduce = streamList.stream().parallel().reduce(1, biFunc, biOper);
        System.out.println(reduce);


    }
}
