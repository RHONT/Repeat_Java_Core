package Predicat.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cats {
    public static void main(String[] args) {
        // Удалить запись если возрасть кошки меньше ageCompare и если начало имени дальше по алфавиту чем nameCompare
        int ageCompare = 5;
        String nameCompare = "A";

        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        Predicate<Cat> prAge = (a) -> a.getAge() < ageCompare;
        Predicate<Cat> prName = (a) -> compareStrings(nameCompare, a.getName());


        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        cats.removeIf(prAge.and(prName));
        System.out.println(cats);

//        System.out.println(cats);
//        char c = 'd';
        System.out.println(compareStrings(nameCompare, cat1.getName()));


    }

    public static boolean compareStrings(String s1, String s2) {

        int comparedResult = s1.compareTo(s2);

        if (comparedResult > 0) {
            return false;
        }
        return true;
    }


    private static class Cat {
        private final String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

