package Collectors;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * !!!!!!!!!!!!
 * Сгруппируйте числа по двум категориям: Четные, нечетные.
 * Сохраните результат в Map
 */
public class OddEvenNumber {
    public static void main(String[] args) {
        List<Integer> listNumber = List.of(1, 2, 3, 4, 5, 6, 7);

        Function<Integer, String> keyMapper = a -> (a % 2 == 0) ? "even" : "odd";
        Function<Integer, List<Integer>> valueMapper = List::of;

        BinaryOperator<List<Integer>> mergeFun = (a, b) -> {
            List<Integer> resultList = new ArrayList<>(a);
            resultList.addAll(b);
            return resultList;
        };

        Supplier<Map<String, List<Integer>>> supMap = HashMap::new;

        Map<String, List<Integer>> resultMap = listNumber
                .stream()
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFun, supMap));
        //или
        Map<String, List<Integer>> groupByMap = listNumber
                .stream()
                .collect(Collectors.groupingBy(a -> (a % 2 == 0) ? "even" : "odd"));

        System.out.println(resultMap);
        System.out.println(groupByMap);
    }
}
