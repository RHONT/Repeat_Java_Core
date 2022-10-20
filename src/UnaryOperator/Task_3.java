package UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Создайте реализацию UnaryOperator<List<String>> где результатом будет список строк
 * (созданный на основе списка выступающего в качестве параметра) длинна которых
 * больше 5 символов.
 */
public class Task_3 {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>(List.of("Евгений","Владислав","Юрий","Шпак","Елизавета"));

        UnaryOperator<List<String>> fiveLessWord=(a)-> {
            List<String> result= new ArrayList<>(List.copyOf(a));
            result.removeIf((b)->b.length()<5);
            return result;
        };

        System.out.println(words);
        //  [Евгений, Владислав, Юрий, Шпак, Елизавета]
        System.out.println(fiveLessWord.apply(words));
        //  [Евгений, Владислав, Елизавета]




    }
}
