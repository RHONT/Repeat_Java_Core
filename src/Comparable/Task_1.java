package Comparable;

import java.util.Arrays;

/**
 * Создайте класс прямоугольник, с двумя полями - длинной и высотой прямоугольника. Задайте
 * отношение естественного порядка для объектов этого класса (реализуйте интерфейс Comparable)
 * на основании площади этого прямоугольника. Используйте эту реализацию для сортировки массива
 * объектов класса прямоугольник.C
 */
public class Task_1 {
    public static void main(String[] args) {
        Rectangle[] tasks={new Rectangle(15,20),
                        new Rectangle(30,20),
                        new Rectangle(40,20),
                        new Rectangle(25,20),
                        new Rectangle(15,20)};
        System.out.println("\n************before************\n");
        for (Rectangle rectangle :tasks) {
            System.out.println(rectangle);
        }

        Arrays.sort(tasks);

        System.out.println("\n************after************\n");

        for (Rectangle rectangle :tasks) {
            System.out.println(rectangle);
        }
    }
}
