package Function.HomeWork;

import java.util.function.Function;

/**
 * Опишите такую реализацию Function<String, Integer> которая вернет количество согласных букв в
 * строке текста.
 */
public class Task_2 {
    public static void main(String[] args) {
        String input = "Мама мыла раму!.";
        Function<String, Integer> fun = a -> a.replaceAll("[аеёиоуыэюя .,!?:]", "").length();
        System.out.println("Количество согласных буквы:" + fun.apply(input) + "\nв строке:" + input);
    }
}
