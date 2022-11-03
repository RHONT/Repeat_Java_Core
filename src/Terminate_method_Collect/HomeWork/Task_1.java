package Terminate_method_Collect.HomeWork;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Используя Collector напишите свою реализацию метода Stream_Api.Collectors.toSet()
 */
public class Task_1 {
    public static void main(String[] args) {

        Stream<Integer> intStream = (new ArrayList<Integer>(List.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8))).stream();
        Set<Integer> set = intStream.collect(new setDuplicate<>());

        intStream = (new ArrayList<Integer>(List.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8))).stream();

        Set<Integer> trueSet = intStream.collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(trueSet);


    }

    static class setDuplicate<T> implements Collector<T, Set<T>, Set<T>> {
        @Override
        public Supplier<Set<T>> supplier() {
            return HashSet::new;
        }

        @Override
        public BiConsumer<Set<T>, T> accumulator() {
            return Set::add;
        }

        @Override
        public BinaryOperator<Set<T>> combiner() {
            return (set1, set2) -> {
                Set<T> resultSet = new HashSet<>(set1);
                resultSet.addAll(set2);
                return resultSet;
            };
        }

        @Override
        public Function<Set<T>, Set<T>> finisher() {
            return Function.identity();
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH);
        }
    }
}
