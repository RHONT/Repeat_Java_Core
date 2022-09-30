package Predicat.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class BiPred {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Google");
        map.put(3,"Jar");
        map.put(4,"IO");

        BiPredicate<Integer,String> biPredicate=(a,b)->b.length()==a;
        map.entrySet().stream().
                filter(entry->biPredicate.test(entry.getKey(), entry.getValue())).
                forEach(entry->System.out.println(entry.getKey() + " " + entry.getValue() ));


    }
}
