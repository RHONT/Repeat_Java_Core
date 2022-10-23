package Stream_Api.Part_Fourth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Из списка целых чисел, выделите те значения которых больше 10, отсортируйте по значению
 * последней цифры результат выведите на экран.
 */
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> rowList=new ArrayList<>(List.of(1,4,45,23,21,66,79,22,99,7,3,55,41,49));

        rowList.stream().filter(a->a>10).sorted(Comparator.comparingInt(a -> (a % 10))).forEach(System.out::println);

    }
}
