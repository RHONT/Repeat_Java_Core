package Comparable;

import java.util.ArrayList;
import java.util.Arrays;

public class RunTask {
    public static void main(String[] args) {
        Task_1 [] tasks={new Task_1(15,20),
                        new Task_1(30,20),
                        new Task_1(40,20),
                        new Task_1(25,20),
                        new Task_1(15,20)};
        System.out.println("\n************before************\n");
        for (Task_1 task_1:tasks) {
            System.out.println(task_1);
        }

        Arrays.sort(tasks);

        System.out.println("\n************after************\n");

        for (Task_1 task_1:tasks) {
            System.out.println(task_1);
        }
    }
}
