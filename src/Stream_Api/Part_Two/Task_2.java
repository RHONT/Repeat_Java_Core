package Stream_Api.Part_Two;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Удалите из строки символы которые не являются буквами английского алфавита.
 */
public class Task_2 {
    public static void main(String[] args) {
        String input = "Hвыапi mывапy naывапыme iыавпыапs Eвыпывапvgenвапвыапiy";
        String result = Arrays.stream(input.split("")).filter(Task_2::checkCirilic).collect(Collectors.joining());
        System.out.println(result);
        //Hi my name is Evgeniy
    }

    static boolean checkCirilic(String input) {
        return Character.UnicodeBlock.of(input.charAt(0)) == Character.UnicodeBlock.BASIC_LATIN;

    }
}