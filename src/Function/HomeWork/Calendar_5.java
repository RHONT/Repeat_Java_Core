package Function.HomeWork;

import java.util.Calendar;
import java.util.Date;
import java.util.function.ToIntFunction;

public class Calendar_5 {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        ToIntFunction<Calendar> fun=a->a.get(Calendar.YEAR);
        System.out.println(fun.applyAsInt(c1));
    }
}
