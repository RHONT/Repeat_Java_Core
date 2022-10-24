package Consumer.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Реализуете Consumer<String> с побочным эффектом в виде занесения всех строк
 * содержащих цифры во вспомогательный список.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<String> inputList=new ArrayList<>(List.of("1. Я хочу","мне","чтвло","штто 1"));
        List<String> resultList=new ArrayList<>();

        Consumer<String> onlyWithDigitsCons=a->{
            if (a.replaceAll("\\D+","").length()>0) resultList.add(a);
        };

        inputList.forEach(onlyWithDigitsCons);

        resultList.forEach(System.out::println);
    }
}
