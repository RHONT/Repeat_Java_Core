package Stream_Api.Part_Sixs;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Замените с помощью метода reduce терминальный метод max
 */
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> streamList = Stream.generate(() -> (int) ((Math.random() * 20 + 1) + 10)).limit(4).collect(Collectors.toList());
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a > b ? a : b;
        BinaryOperator<Integer> binaryOperator = (a, b) -> a > b ? a : b;

        System.out.println(streamList);

        Integer reduce = streamList.stream().reduce(0, biFunction, binaryOperator);

        System.out.println(reduce);


    }
}
