package Comparable;

import java.util.*;

/**
 * Реализуйте обобщенный метод поиска максимального элемента в массиве объектов. Для этого
 * укажите ограничение для параметра типа этого метода как Comparable<T>. Сигнатура такого
 * метода должна выглядеть следующим образом:
 * <T extends Comparable<T>> T max(T[] array)
 */

public class Task_2 {
    public static void main(String[] args) {
        Rectangle[] tasks = {new Rectangle(15, 20),
                new Rectangle(30, 20),
                new Rectangle(40, 20),
                new Rectangle(25, 20),
                new Rectangle(15, 20)};

        System.out.println(max(tasks));

    }

    public static <T extends Comparable<T>> T max(T[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        return array[0];
    }
}
