package Stream_Api.Part_One;

import java.util.Comparator;
import java.util.List;

/**
 * Используя Stream API и List<Cat> верните самое длинное имя кота в этом списке.
 */
public class Task_1 {
    public static void main(String[] args) {

        СatForWork cat1 = new СatForWork("Luska", 5, "White");
        СatForWork cat2 = new СatForWork("Umka", 7, "Black");
        СatForWork cat3 = new СatForWork("Barsic", 2, "Red");
        СatForWork cat4 = new СatForWork("Luska", 3, "Grey");

        List<СatForWork> list = List.of(cat1, cat2, cat3, cat4);
        String maxName=list.stream().max(Comparator.comparingInt(a -> a.getName().length())).map(СatForWork::getName).get();
        System.out.println(maxName);
        ///   Barsic


    }
}
