package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Создайте реализацию Comparator<Integer> для сортировки списка целых чисел. Но сравнение
 * должно выполняться на основание суммы первой и последней цифры числа. Т.е например список
 * чисел подобного вида [62,2000,306,55] должен быть отсортирован как [2000, 62, 306,55].
 */
public class Task_3 {
    public static void main(String[] args) {

        List<Integer> integerList= new ArrayList<>(List.of(62, 2000, 306, 55, 11, 1));

        Comparator<Integer> comparator1= Task_3::FirstLastSum;

        Collections.sort(integerList,comparator1);

        System.out.println(integerList);
    }

    public static int FirstLastSum(int o1, int o2){

        int length_o1=String.valueOf(o1).length();
        int length_o2=String.valueOf(o2).length();

        int sum_o1;
        int sum_o2;

        sum_o1 = length_o1==1 ? o1 :findPartString(o1, 0) + findPartString(o1, length_o1 - 1);
        sum_o2 = length_o2==1 ? o2 :findPartString(o2, 0) + findPartString(o2, length_o2 - 1);


        if (sum_o1>sum_o2) {
            return 1;
        }
        if (sum_o1<sum_o2) {
            return -1;
        }
        return 0;
    }

    public static Integer findPartString(int digit,int position){
        String bufString=String.valueOf(digit);
        return Integer.parseInt(String.valueOf(bufString.charAt(position)));
    }
}
