package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Используя составной Comparator реализуйте в List<Integer> поиск числа модуль которого
 * наиболее близок к нулю. Если встретятся два модуль которых одинаково близок к нулю(например
 * 5 и -5) то верните положительное значение.
 */
public class Task_2 {
    public static void main(String[] args) {

        int closeToZero;
        List<Integer> numberForSort=new ArrayList<>(List.of(-5,5,2,-1,6,10,-10,-2,1));
        numberForSort.add(null);

        Comparator<Integer> comparator= Comparator.comparingInt(Math::abs);
        Comparator<Integer> comparator2= Task_2::compare;
        Comparator<Integer> resultComp=Comparator.nullsLast(comparator.thenComparing(comparator2));

        Collections.sort(numberForSort,resultComp);

        closeToZero=numberForSort.get(0);

        System.out.println(numberForSort);
        System.out.println(closeToZero);

    }

    public static int compare(Integer o1, Integer o2) {
        if (Math.abs(o1)==Math.abs(o2) && (o1>o2)) {
            return -1;
        }
        return 0;
    }

}

