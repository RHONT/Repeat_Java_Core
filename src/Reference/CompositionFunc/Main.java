package Reference.CompositionFunc;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    final static int quantity=10;
    public static void main(String[] args) {

        Function<String,String[]> fun=funComposition(Main::buildMass,Main::modifiedArray);

        String[] array = fun.apply("Зерги");
        System.out.println(Arrays.toString(array));

//output:  [Зерги 1, Зерги 2, Зерги 3, Зерги 4, Зерги 5, Зерги 6, Зерги 7, Зерги 8, Зерги 9, Зерги 10]

    }

    static <R,S,T>Function<R,T> funComposition(Function<R,S> lengthWord,Function<S,T> slainie){

        class Compose{
            public T comp(R first){
                S temp= lengthWord.apply(first);
                return slainie.apply(temp);
            }
        }
        Compose compose=new Compose();
        return compose::comp;

    }

    static String[] buildMass(String str){

        String[] resultArray=new String[quantity];
        Arrays.fill(resultArray,str);
         return resultArray;
    }

    static String[] modifiedArray(String[] arrayStr){
        int count=0;

        for (int i=0;i<quantity;i++) {
            arrayStr[i]=arrayStr[i].concat(" " + ++count);
        }
        return arrayStr;
    }


}
