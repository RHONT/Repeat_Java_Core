package Predicat.HomeWork;

import java.util.function.IntPredicate;

public class PrimitivePred {
    public static void main(String[] args) {

        IntPredicate prInt=(a)->{
            int result = 0;
            String stroka=String.valueOf(a);
            char[] chars = stroka.toCharArray();
            for (char c:chars) {
                result+= Integer.parseInt(String.valueOf(c));
            }
            return (result % 2 == 0);
    };

        System.out.println(prInt.test(1026));

    }

}
