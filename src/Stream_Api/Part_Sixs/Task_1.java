package Stream_Api.Part_Sixs;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Разбейте строку английского текста по символу пробел. Используя reduce верните суммарное
 * количество букв в словах длинна которых превышает 4.
 */
public class Task_1 {
    public static void main(String[] args) {
        String input="The first of such lists was made by a Greek historian Herodotus. Only three places were mentioned in it.";
        String[] inputArr=input.replaceAll("[.,!?-]","").split(" ");

        BiFunction<Integer,String, Integer> biFun = (a,b)->b.length()>4?a+b.length(): a;
        BinaryOperator<Integer> biOper= Integer::sum;
        int result= Arrays.stream(inputArr).reduce(0,biFun,biOper);
        System.out.println(result);
    }
}
