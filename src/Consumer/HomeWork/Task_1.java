package Consumer.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Реализуйте Consumer<Integer> с помощью которого выведите на экран все нечетные
 * числа содержащиеся в List<Integer>.
 */
public class Task_1 {
    public static void main(String[] args) {

        Consumer<Integer> cons= a->{
            if (a%2!=0) System.out.println(a);
        };

        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6));
        list.forEach(cons);

    }
}
