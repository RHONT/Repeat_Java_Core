package Stream_Api.Part_One;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Используя Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
 * по возрастанию и соберите в новый список.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 3, -2, 4, -1, 7);
        List<Integer> resultSortList = list.stream().filter((a) -> a % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(resultSortList);

    }
}
