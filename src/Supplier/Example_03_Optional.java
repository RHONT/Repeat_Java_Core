package Supplier;

import java.util.Arrays;
import java.util.Optional;

public class Example_03_Optional {
    public static void main(String[] args) {

        String [] names=new String[] {"Luke","Vaider","Asoka","R2D2"};
        String firstLetter="D";
        Optional<String> returnName=Optional.ofNullable(findFirstByFirstLetter(names,firstLetter));
        String result= returnName.orElseGet(()->"Name not found");
        System.out.println(result);
    }

    public static String findFirstByFirstLetter(String [] names, String firstLetter){
        for (String name: names) {
            if (name.startsWith(firstLetter)){
                return name;
            }
        }
        return null;
    }
}
