package Function.HomeWork;

import java.util.function.Function;

public class SumSimbol_3 {
    public static void main(String[] args) {
        String inStr="Мама мыла раму";
        Function<String,Integer> fun=a->{
            int sum=0;
            char [] charMass=a.toCharArray();
            for(char c: charMass){
                sum+=c;
            }
            System.out.println(a);
            return sum;
        };

        System.out.println(fun.apply(inStr));
    }
}
