package Function;

import java.util.Arrays;
import java.util.function.Function;

public class CompositionFunc {
    public static void main(String[] args) {
        Function<String,String[]> fun1=a->a.split(" ");
        Function<String[],int[]> fun2=CompositionFunc::getLengthString;
        //сначала срабатывает 1, потом 2
        //Есть еще метод Compose, то же самое, только наоборот.
        Function<String,int []> fun3= fun1.andThen(fun2);
        int [] result=fun3.apply("Darth is alive");
        System.out.println(Arrays.toString(result));
    }

    private static int[] getLengthString(String[] strings) {
        int [] result=new int[strings.length];
        for(int i=0;i< strings.length;i++){
            result[i]=strings[i].length();
        }
        return result;
    }


}
