package Stream_Api.Collectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CollectorsSimpleExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(7, 2, 3, 4, 5, 6, 7));

        List<Integer> even = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("Четные числа в новом листе");
        even.forEach(System.out::println);

        System.out.println("///////////////////////////////////////////////");
        System.out.println("Группируем через метод collect на четные и нечетные");

        Supplier<Map<String, List<Integer>>> createMap = () -> {
            Map<String, List<Integer>> returnMap = new HashMap<>(Map.of(
                    "Четные", new ArrayList<>(),
                    "Нечетные", new ArrayList<>()));
            return returnMap;

        };

        BiConsumer<Map<String, List<Integer>>, Integer> putElement = (map, element) -> {
            boolean result = element % 2 == 0;
            if (result) {
                map.get("Четные").add(element);
            } else
                map.get("Нечетные").add(element);
        };

        BiConsumer<Map<String, List<Integer>>, Map<String, List<Integer>>> combine = (map1, map2) -> {
            map1.forEach((key1, val1) -> map1.get(key1).addAll(val1));
        };

        Map<String, List<Integer>> resultMap = numbers.stream().collect(createMap, putElement, combine);

        System.out.println(resultMap);

        System.out.println("///////////////////////////////////////////////");
        System.out.println("Группируем через метод collect на четные и нечетные");


    }
}
