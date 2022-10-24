package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Массив строк преобразовать в массив чисел
 */

public class MainTwo {
    public static void main(String[] args) {

        List<String> listGame = List.of("Diablo", "Fallout", "Nox");

        Function<String, Integer> fun = String::length;

        List<Integer> listNumb = reformat(fun, listGame);

        System.out.println(listNumb);
    }

    public static <T, R> List<R> reformat(Function<T, R> fun, List<T> list) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            resultList.add(fun.apply(t));
        }
        return resultList;

    }

}
