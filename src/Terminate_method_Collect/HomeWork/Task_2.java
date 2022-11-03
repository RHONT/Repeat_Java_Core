package Terminate_method_Collect.HomeWork;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

/**
 * Используя Collector соберите в карту, только те слова в потоке строк, в которых есть гласные.
 */

public class Task_2 {
    public static void main(String[] args) {
        String str = "Мама мыла, раму гххт. ааа";

        Predicate<String> predicate = a -> a.replaceAll("[бвгджзйклмнпрстфхцчшщ.,!?]", "").toLowerCase(Locale.ROOT).length() > 0;

        Collector<String, Set<String>, Set<String>> collector = new WordEx<>(predicate);

        Set<String> word = Arrays.stream(str.split(" ")).collect(collector);

        System.out.println(word);
    }

    static class WordEx<T> implements Collector<T, Set<T>, Set<T>> {
        private Predicate<T> predicate;

        public WordEx(Predicate<T> predicate) {
            this.predicate = predicate;
        }

        @Override
        public Supplier<Set<T>> supplier() {
            return HashSet::new;
        }

        @Override
        public BiConsumer<Set<T>, T> accumulator() {
            return (
                    (set, element) -> {
                        if (predicate.test(element)) set.add(element);
                    });

        }

        @Override
        public BinaryOperator<Set<T>> combiner() {
            return null;
        }

        @Override
        public Function<Set<T>, Set<T>> finisher() {
            return Function.identity();
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED);
        }
    }


}
