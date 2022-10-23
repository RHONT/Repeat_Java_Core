package Stream_Api.Part_Fourth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * Разбейте строку английского текста по символу пробел. Полученный набор слов отсортируйте в
 * порядке возрастания количества гласных букв в нем. Слова в которых нет гласных букв стоит
 * исключить из результата.
 */
public class Task_1 {
    public static void main(String[] args) {

        final String input="Мама мыла раму, Маз, Камаз, водолаз, РПГ, С300, у каратиста.";

        List<String> words= Arrays
                .stream(input.split(" "))
                .map(a->a.trim().replaceAll("[,.!?]",""))
                .collect(Collectors.toList());

//        ToIntFunction<String> vowelsFunc=a->{
//            int count = 0;
//            String vowels = "аиыоуё";
//            for (char c : a.toCharArray()) {
//                if (vowels.contains(String.valueOf(c))) count++;
//            }
//            return count;
//        };

        List<String> strings = words.
                stream()
                .filter(a -> a.length() > a.replaceAll("[аиоуё]", "").length())
                .sorted(Comparator.comparingInt(new SequanceVowels())).collect(Collectors.toList());
        strings.forEach(System.out::println);
    }
}

class SequanceVowels implements ToIntFunction<String> {
    @Override
    public int applyAsInt(String value) {
        int count = 0;
        String vowels = "аиыоуё";
        for (char c : value.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) count++;
        }
        return count;
    }
}


