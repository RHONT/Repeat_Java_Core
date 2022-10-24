package Function;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Массив строк преобразовать в массив строк но с числовым значением.
 */
public class mainOne {

    public static void main(String[] args) {

        String[] strMass = {"Diablo", "Fallout", "Nox"};

        Function<String, String> fun = a -> String.valueOf(a.length());

        String[] strNumberChar = reformat(fun, strMass);

        System.out.println(Arrays.toString(strNumberChar));
    }

    public static <T, R> String[] reformat(Function<T, R> fun, String[] strMass) {
        String[] result = new String[strMass.length];
        for (int i = 0; i < strMass.length; i++) {
            result[i] = (String) fun.apply((T) strMass[i]);
        }
        return result;

    }
}
