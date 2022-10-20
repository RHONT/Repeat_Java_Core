package BinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Создайте реализацию BinaryOperator<String> которая будет возвращать самое
 * длинное слово из двух строк переданных в качестве параметров.
 */
public class Task_1 {
    public static void main(String[] args) {
        BinaryOperator<String> lengthWord=BinaryOperator.maxBy(Comparator.comparingInt(String::length));
        System.out.println(lengthWord.apply("Una","Moon"));
        //  Moon

    }
}
