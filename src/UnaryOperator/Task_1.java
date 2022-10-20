package UnaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * С помощью реализации UnaryOperator замените все нечетные числа в списке целых
 * чисел на нули.
 */
public class Task_1 {
    public static void main(String[] args) {

        int[] digits={1,2,3,4,5,6,7,8,9,10};

        UnaryOperator<int[]> un1=(a)->{
            for (int i=0;i< a.length;i++) {
                a[i]=a[i]%2==0?a[i]:0;
            }
            return a;
        };

        un1.apply(digits);

        System.out.println(Arrays.toString(digits));
        // [0, 2, 0, 4, 0, 6, 0, 8, 10]

    }
}
