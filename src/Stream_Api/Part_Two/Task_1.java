package Stream_Api.Part_Two;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Удалите из строки текста все слова длиннее 5 символов.
 */
public class Task_1 {
    public static void main(String[] args) {
        String input="Мама мыла раму, а потом как включила гальвонизатор и перетурбатор Паркинсона!";

        String result=Arrays.stream(input.replaceAll("[?,.!]", "").split(" ")).
                filter(a->a.length()<6).
                collect(Collectors.joining(" "));

        System.out.println(result);
        //Мама мыла раму а потом как и

    }
}
