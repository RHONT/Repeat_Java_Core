package Comparators;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Создайте такую реализацию Comparator<Integer> что бы с ее помощью можно было найти
 * максимальное простое число в списке целых чисел, если такого числа в списке нет то должно
 * быть возвращено минимальное число.
 */

public class Task_4 {

    private static BigInteger bufferSimple_o1;
    private static BigInteger bufferSimple_o2;

    private static boolean isSimple_o1;
    private static boolean isSimple_o2;

    public static void main(String[] args) {

        List<Integer> rowListNumber = new ArrayList<>(List.of(18,20,6,8,7,11));

        Comparator<Integer> splitListComp = Task_4::splitList;
        Comparator<Integer> doubleSortListComp = Task_4::doubleSort;

        rowListNumber.sort(splitListComp);
        rowListNumber.sort(doubleSortListComp);

        System.out.println(rowListNumber);
        System.out.println("Необходимое число: " + rowListNumber.get(0) + " и оно " + checkSimple(rowListNumber.get(0)));
        //Задачу выполнил, но не так. Но тоже хорошо. Ниже показана человеческая реализация
    }

    public static int splitList(int o1, int o2) {

        bufferSimple_o2 =BigInteger.valueOf(o2);

        boolean boo2 = bufferSimple_o2.isProbablePrime((int) Math.log(o2));

        if (boo2) {
            return 1;
        } else return -1;
    }

    public static int doubleSort(int o1, int o2) {
        bufferSimple_o1 = BigInteger.valueOf(o1);
        bufferSimple_o2 = BigInteger.valueOf(o2);
        isSimple_o1 = bufferSimple_o1.isProbablePrime((int) Math.log(o1));
        isSimple_o2 = bufferSimple_o2.isProbablePrime((int) Math.log(o2));
        if (isSimple_o2 && isSimple_o1) {
            if (o1 < o2) {
                return 1;
            }
                if (o1 > o2) {
                    return -1;
                }
        }
        if (!isSimple_o1 && !isSimple_o2) {
            if (o1 < o2) {
                return -1;
            }
            if (o1 > o2) {
                return 1;
            }
        }
        return 0;
    }

    public static String checkSimple(int digit){
        bufferSimple_o1=BigInteger.valueOf(digit);
        return (bufferSimple_o1.isProbablePrime((int)Math.log(digit)) ? "Простое число" : "Обычное число");
    }
}

