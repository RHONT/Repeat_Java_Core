package Comparable;

import Comparators.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Установите отношение естественного порядка для класса Cat на основании длинны имени. Т.е. чем
 * длиннее имя тем больше объект. Ваша реализация Comparable<Cat> должна быть совместима с
 * отношением эквивалентности (метод equals при необходимости можете также заменить).
 */

public class Task_3 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        Collections.sort(cats);
        cats.forEach(System.out::println);

    }



}
