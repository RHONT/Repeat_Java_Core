package Function.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;

public class TwoString_4 {
    public static void main(String[] args) {

        String str_1="Мама мыла раму. А Генадий шел следом за котом.";
        String str_2="За котом гналась мышь, до тех пор, пока кот не ударился о раму";

        BiFunction<String,String,String []> fun=(a,b)->{
            List<String> forResultMass=new ArrayList<>();
            List<String> list_1=Arrays.asList
                    (a.replaceAll("[.,!?:]","").toLowerCase(Locale.ROOT).split(" "));
            List<String> list_2=Arrays.asList
                    (b.replaceAll("[.,!?:]","").toLowerCase(Locale.ROOT).split(" "));
            for(String s:list_2) {
                if (list_1.contains(s)) {
                    forResultMass.add(s);
                }
            }

            return  forResultMass.toArray(forResultMass.toArray(new String[0]));

        };

        System.out.println(Arrays.toString(fun.apply(str_1,str_2)));

    }
}
