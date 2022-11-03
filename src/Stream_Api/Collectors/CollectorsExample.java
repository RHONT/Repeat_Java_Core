package Stream_Api.Collectors;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    static int index = 0;

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(7, 2, 3, 4, 5, 6, 7));

        Function<Integer, List<Integer>> syperFunc = a -> {
            index++;
            List<Integer> accum = numbers.subList(0, index);
            if (index >= numbers.size()) index = 0;
            return accum;
        };
        // Вызываеться когда идет утык на уже существующий ключ.
        BinaryOperator<List<Integer>> merge = (a, b) -> {
            List<Integer> result = new ArrayList<>(a);
            result.addAll(b);
            return result;
        };

        Map<Integer, List<Integer>> first = numbers
                .stream()
                .collect(Collectors.toMap(Function.identity(), syperFunc, merge, HashMap::new));
        System.out.println("Каждый следующий элемент потока создает лист с нарастающим количеством исходного массива");
        System.out.println(first);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        // Компактное решение для простых вариантов groupBy

        Map<String, List<Integer>> evenOrOdd = numbers
                .stream()
                .collect(Collectors.groupingBy(a -> (a % 2 == 0) ? "Even" : "odd"));

        System.out.println("Четные и нечетные числа потока");
        System.out.println(evenOrOdd);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        // Классифицируем файлы по разрешению
        Function<File, String> classifier = a -> a.getName().substring(a.getName().lastIndexOf(".") + 1);

        Map<String, List<File>> resulFileList = Collections.emptyMap();

        try {
            resulFileList = Files
                    .list(Path.of("D:\\Рабочая\\2022\\Октрябрь\\28\\"))
                    .map(Path::toFile)
                    .collect(Collectors.groupingBy(classifier));
        } catch (Exception e) {
            System.out.println("Папка не найдена: " + e.getMessage());
        }

        System.out.println("Классифицируем файлы по разрешению");
        if (!resulFileList.isEmpty()) {
            resulFileList.forEach((a, b) -> {
                System.out.println(a);
                b.stream().map(File::getName).forEach(System.out::println);
            });

        }

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        // Более сложный пример || Классифицируем файлы по разрешению
        Map<String, List<String>> template = (Map.of(
                "Document", List.of("txt", "pdf")
                , "Image", List.of("jpg", "jpeg")
                , "Work File", List.of("cdr")));

        Function<File, String> getExpansion = file -> {
            int position = file.getName().lastIndexOf(".");
            return file.getName().substring(position + 1);
        };

        Function<File, String> outerClassifier = file -> {
            for (var keyStr : template.keySet()) {
                if (template.get(keyStr).contains(getExpansion.apply(file))) {
                    return keyStr;
                }
            }
            return "not classifier";
        };

        Function<File, String> innerClasifier = file -> getExpansion.apply(file);

        Map<String, Map<String, List<File>>> treeFiles = Collections.emptyMap();

        try {
            treeFiles = Files
                    .list(Path.of("D:\\Рабочая\\2022\\Октрябрь\\25\\"))
                    .map(Path::toFile)
                    .collect(Collectors.groupingBy(outerClassifier, Collectors.groupingBy(innerClasifier)));

        } catch (Exception e) {
            System.out.println("Папка не найдена: " + e.getMessage());
        }

        System.out.println("Более сложный пример || Классифицируем файлы по типу файлов и разрешению");
        treeFiles.forEach((key, innerMap) -> {
            System.out.println(key);
            innerMap.forEach((expansion, list) -> {
                System.out.println("\t" + expansion);
                list.forEach(file -> System.out.println("\t\t" + file.getName()));
            });
        });

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        // Булевская группировка

        Predicate<Integer> predicate = numb -> numb % 2 == 0;

        Map<Boolean, List<Integer>> booleans = numbers.stream().collect(Collectors.partitioningBy(predicate));

        System.out.println("Булевская сортировка на четные и нечетные");
        booleans.forEach((bool, list) -> System.out.println(bool + " : " + list));

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        // Какая буква сколько раз встречалась

        ArrayList<String> strings = new ArrayList<>(List.of("Java", "Python", "Riddick", "Stalone"));

        Function<String, ? extends Stream<String>> streamWords = str -> Arrays.stream(str.toLowerCase(Locale.ROOT).split(""));

        BinaryOperator<Integer> mergeSimbol = Integer::sum;

        Collector<String, ?, Map<String, Integer>> packaging = Collectors.toMap(Function.identity(), (str) -> 1, mergeSimbol);

        Map<String, Integer> resultWord = strings.stream().collect(Collectors.flatMapping(streamWords, packaging));

        System.out.println("Сколько какая буква встречалась в потоке:");
        strings.forEach(System.out::println);
        System.out.println(resultWord);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        // Получение суммарной статистики с потока
        IntSummaryStatistics summaryStatistic = numbers.stream().collect(Collectors.summarizingInt(a -> a));

        System.out.println("Общая статистика через класс IntSummaryStatistics");
        System.out.println(summaryStatistic.getMax());
        System.out.println(summaryStatistic.getMin());
        System.out.println(summaryStatistic.getCount());
        System.out.println(summaryStatistic.getSum());
        System.out.println(summaryStatistic.getAverage());
        System.out.println(summaryStatistic.getMin());

    }

}
