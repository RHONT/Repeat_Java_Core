package Terminate_method_Collect;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class First {

    public static void main(String[] args) {
        List<Unit> untList = new ArrayList<>(List.of(
                new Unit("Spider", 10, 20),
                new Unit("Halk", 40, 1),
                new Unit("Magneto", 50, 5),
                new Unit("Runner", 400, 90),
                new Unit("Medusa", 250, 20),
                new Unit("Demon", 600, 80),
                new Unit("Gorgula", 900, 60),
                new Unit("Kurt", 30, 70)
        ));


        List<Unit> slowList = untList.stream().filter(a -> a.getSpeed() < 50).collect(Collectors.toList());
        //Те же яйца, только в профиль.
        List<Unit> slowList2 = untList.stream().
                filter(a -> a.getSpeed() < 50).
                collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        //Теперь попробую сортировку по группам скорости быстрые-медленные
        Map<String, List<Unit>> sortedList = untList.stream().
                collect(First::createMap, First::addToMap, First::mergeMap);

        System.out.println("Юниты со скоростью меньше 50 км/ч");
        slowList.forEach(a -> {
            System.out.println("\t " + a);
        });

        System.out.println("///////////////////////////////////////");

        Predicate<Unit> predicate = (a) -> a.getSpeed() < 50;
        Collector<Unit, List<Unit>, List<Unit>> collector = new NewCollector(predicate);

        List<Unit> newListCollect = untList.stream().collect(collector);
        System.out.println(newListCollect);

        sortedList.forEach((classifier, list) -> {
            System.out.println(classifier);
            list.forEach((a) -> System.out.println("\t " + a));
        });


    }

    public static Map<String, List<Unit>> createMap() {
        Map<String, List<Unit>> map = new HashMap<>();
        map.put("Slow Unit", new ArrayList<>());
        map.put("Faster Unit", new ArrayList<>());
        return map;
    }

    public static void addToMap(Map<String, List<Unit>> map, Unit unt) {
        if (unt.getSpeed() < 50) {
            map.get("Slow Unit").add(unt);
        } else {
            map.get("Faster Unit").add(unt);
        }

    }

    public static void mergeMap(Map<String, List<Unit>> map, Map<String, List<Unit>> finishMap) {
        finishMap.forEach((k, v) -> map.get(k).addAll(v));
    }

}

class NewCollector implements Collector<Unit, List<Unit>, List<Unit>> {
    private Predicate<Unit> predicate;

    public NewCollector(Predicate<Unit> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Supplier<List<Unit>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Unit>, Unit> accumulator() {

        return (a, b) -> {
            if (predicate.test(b)) {
                a.add(b);
            }
        };
    }

    @Override
    public BinaryOperator<List<Unit>> combiner() {
        return (a, b) -> {
            List<Unit> result = new ArrayList<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };
    }

    @Override
    public Function<List<Unit>, List<Unit>> finisher() {
        return Function.identity();
    }

    // Без этого параметра ничего не работает!
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}

