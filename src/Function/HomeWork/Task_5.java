package Function.HomeWork;

import java.util.Calendar;
import java.util.function.ToIntFunction;

/**
 * Используя примитивную специализацию Function реализуйте функционал который на основе
 * объекта типа java.util.Calendar вернет целое число значение которого равно году хранимому в
 * Calendar.
 */
public class Task_5 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        ToIntFunction<Calendar> fun = a -> a.get(Calendar.YEAR);
        System.out.println(fun.applyAsInt(c1));
    }
}
