package Function;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Преобразовать строку в массив, где каждая ячейка равно длине слова из строки
 */
public class CompositionFunc {
    public static void main(String[] args) {

        Function<String, String[]> fun1 = a -> a.split(" ");
        Function<String[], int[]> fun2 = CompositionFunc::getLengthString;

        //пример композиции функции
        Function<String, int[]> fun3 = fun1.andThen(fun2);

        int[] result = fun3.apply("Darth Moll is alive");

        System.out.println(Arrays.toString(result));
    }

    private static int[] getLengthString(String[] strings) {

        int[] result = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].length();
        }
        return result;
    }
}
