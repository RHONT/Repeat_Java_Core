package BinaryOperator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Создайте реализацию BinaryOperator<List<T extends Comparable<T>> который будет
 * возвращать список в котором находиться минимальный элемент среди двух списков
 * использованных в качестве параметра. Например для списков [5,0,3,4] и [10,-2, 5]
 * нужно вернуть [10, -2, 5] так как элемент -2 минимален среди элементов этих списков.
 */
public class Task_3 {
    public static void main(String[] args) {

        List<Integer> digitsFirst = new ArrayList<>(List.of(5, 0, 3, 4));
        List<Integer> digitsSecond = new ArrayList<>(List.of(10, -2, 5));

        BinaryOperator<List<Integer>> onlyWithMin = (a, b) -> {
            int minA = a.stream().min(Comparator.comparingInt(c -> c)).get();
            int minB = b.stream().min(Comparator.comparingInt(c -> c)).get();
            if (minA > minB) return b;
            return a;
        };

        System.out.println(onlyWithMin.apply(digitsFirst, digitsSecond));
        // [10, -2, 5]


    }
}
