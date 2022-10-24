package Function.HomeWork;

import java.util.function.Function;

/**
 * Используя композицию функций реализуйте функцию которая вернет сумму кодов каждого
 * символа в произвольной строке.
 */
public class Task_3 {
    public static void main(String[] args) {
        var input = "Мама мыла раму";

        Function<String, Integer> fun = a -> {
            int sum = 0;
            for (char c : a.toCharArray()) {
                sum += c;
            }
            return sum;
        };
        System.out.println("Сумма кодов символов в строке: " + input);
        System.out.println(fun.apply(input));
    }
}
