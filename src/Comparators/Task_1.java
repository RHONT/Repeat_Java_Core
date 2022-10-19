package Comparators;

import java.util.Arrays;
import java.util.Comparator;

/**
 * С помощью реализации Comparator<Cat> отсортируйте массив Cat в порядке возрастания
 * длинны имени. Т.е. сначала должны идти коты чье имя самое короткое.
 */


public class Task_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);
        Cat cat6 = new Cat("Mu", 22);
        Cat cat7 = new Cat("Z", 50);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5, cat6, cat7 };

        Comparator<Cat> catComparator=(a,b)->a.getName().length()-b.getName().length();

        for (Cat cat:cats) {
            System.out.println(cat);
        }
        Arrays.sort(cats,catComparator);
        System.out.println("***********");

        for (Cat cat:cats) {
            System.out.println(cat);
        }
    }


}


