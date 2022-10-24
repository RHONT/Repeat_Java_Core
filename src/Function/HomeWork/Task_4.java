package Function.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Опишите такую реализацию BiFunction<String,String,String[]> которая вернет в виде массива
 * слова которые одновременно присутствуют и в первой строке и во второй (слова разделены
 * пробелами). Например text1 = «Hello Java», text2 = «Hello Python» в результате должен быть
 * массив вида [«Hello»].
 */
public class Task_4 {
    public static void main(String[] args) {

        var str_1 = "Мама мыла раму. А Генадий шел следом за котом.";
        var str_2 = "За котом гналась мышь, до тех пор, пока кот не ударился о раму";

        Function<String, String[]> stringToArray = a -> a
                .replaceAll("[.,!?:]", "")
                .toLowerCase(Locale.ROOT)
                .split(" ");

        BiFunction<String, String, String[]> fun = (a, b) -> {

            List<String> resultList = new ArrayList<>();

            List<String> list_1 = Arrays.asList(stringToArray.apply(a));

            String[] list_2 = stringToArray.apply(b);

            for (var s : list_2) {
                if (list_1.contains(s)) {
                    resultList.add(s);
                }
            }
            return resultList.toArray(new String[0]);
        };

        System.out.println("Слова встречающиеся в обоих массивах таковы:");
        System.out.println(Arrays.toString(fun.apply(str_1, str_2)));

    }
}
