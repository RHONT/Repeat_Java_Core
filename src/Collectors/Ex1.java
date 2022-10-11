package Collectors;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> listNuvber=List.of(1,2,3,4,5,6,7);
        Function<Integer,String> keyMapper=a->(a%2==0)?"even":"odd";
        Function<Integer,List<Integer>> valueMapper=a->List.of(a);

        BinaryOperator<List<Integer>> mergeFun=(a,b)-> {
          List<Integer> resultList=new ArrayList<>(a);
          resultList.addAll(b);
          return resultList;
        };

        Supplier<Map<String,List<Integer>>> supMap= HashMap::new;


        Map<String, List<Integer>> resultMap = listNuvber.stream().collect(Collectors.toMap(keyMapper, valueMapper, mergeFun, supMap));
        //или
        Map<String,List<Integer>> resultMap2=listNuvber.stream().collect(Collectors.groupingBy(a->(a%2==0)?"even":"odd"));
        System.out.println(resultMap);
        System.out.println(resultMap2);
    }
}
