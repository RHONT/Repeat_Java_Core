package Stream_Api.Part_Two;

import Stream_Api.Part_One.СatForWork;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Удалите из List<Cat> всех кошек вес которых меньше 3 кг, отсортируйте их по именам (в
 * лексикографическом порядке) и соберите результат в новый список Cat.
 */
public class Task_3 {
    public static void main(String[] args) {

        СatForWork cat1 = new СatForWork("Luska", 7, "White");
        СatForWork cat2 = new СatForWork("Umka", 7, "Black");
        СatForWork cat3 = new СatForWork("Barsic", 2, "Red");
        СatForWork cat5 = new СatForWork("Luska", 3, "Grey");
        СatForWork cat6 = new СatForWork("Abba", 5, "Grey");
        СatForWork cat7 = new СatForWork("Sneshok", 1, "Grey");
        СatForWork cat8 = new СatForWork("Zaza", 8, "Grey");

        List<СatForWork> list = List.of(cat1, cat2, cat3, cat5,cat8,cat6,cat7);

        final List<СatForWork> resultList = list.stream().
                sorted(Comparator.comparingInt(СatForWork::getWeight)).
                dropWhile((a) -> a.getWeight() < 3).
                sorted(Comparator.comparing(СatForWork::getName)).
                collect(Collectors.toList());

        resultList.forEach(System.out::println);

    }
}
