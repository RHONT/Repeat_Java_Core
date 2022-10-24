package Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task_4_Update {
    public static void main(String[] args) {
        List<Integer> rowList = new ArrayList<>(List.of(163, 149, 113, 30, 2, 7, 6, 11, 13, 20, 50));
        System.out.println(rowList);

        Comparator<Integer> naturComp = Comparator.<Integer>naturalOrder();
        Comparator<Integer> resultComp = UpFunctionComparator.check(naturComp);

        rowList.sort(resultComp);
        System.out.println(rowList);
    }
}
