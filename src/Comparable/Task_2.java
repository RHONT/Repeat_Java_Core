package Comparable;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Task_1 [] tasks={new Task_1(15,20),
                new Task_1(30,20),
                new Task_1(40,20),
                new Task_1(25,20),
                new Task_1(15,20)};

        System.out.println(max(tasks));

    }
    public static <T extends Comparable<T>>T max(T[] array){
        Arrays.sort(array,Comparator.reverseOrder());
        return array[0];
    }
}
