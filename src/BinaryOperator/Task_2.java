package BinaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Создайте реализацию BinaryOperator<List<Integer>> которая вернет список в котором
 * будут только те элементы которые одновременно присутствуют в первом и во втором
 * списке целых чисел использованных в качестве параметров.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> digitsFirst = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> digitsSecond = new ArrayList<>(List.of(4, 5, 6, 7, 8));

        BinaryOperator<List<Integer>> intersection = (a, b) -> a.stream().filter(b::contains).collect(Collectors.toList());
        System.out.println(intersection.apply(digitsFirst, digitsSecond));
        //  [4, 5]
    }
}
