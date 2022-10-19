package Comparators;

import java.math.BigInteger;
import java.util.Comparator;

public interface UpFunctionComparator {

    int NOT_SIMPLE =11;

    static <T> Comparator<T> check(Comparator<T> uncheck){

        class Intermediate implements Comparator<T>{
            @Override
            public int compare(T o1, T o2) {
                int result=isSimple(o1,o2);
                if (result == NOT_SIMPLE) {
                    return uncheck.compare(o1,o2);
                }
                return result;
            }
        }
        return new Intermediate();
    }

    static private <T> int isSimple(T o1,T o2){

        BigInteger b1=BigInteger.valueOf((int)o1);
        BigInteger b2=BigInteger.valueOf((int)o2);

        boolean checkSimpleFirst=b1.isProbablePrime((int) Math.log((int)o1));
        boolean checkSimpleSecond=b2.isProbablePrime((int) Math.log((int)o2));

        if (checkSimpleFirst && checkSimpleSecond) {
            return Integer.compare((int)o1,(int)o2);
        }
        if (!checkSimpleFirst && checkSimpleSecond) {
            return -1;
        }
        if (checkSimpleFirst)  {
            return 1;
        }
        return NOT_SIMPLE;
    }

}
