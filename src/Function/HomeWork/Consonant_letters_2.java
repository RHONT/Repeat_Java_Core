package Function.HomeWork;

import java.util.function.Function;


public class Consonant_letters_2 {
    public static void main(String[] args) {
        String str="Мама мыла раму!.";
        Function<String,Integer> fun=a->a.replaceAll("[аеёиоуыэюя .,!?:]","").length();
        System.out.println(fun.apply(str));
    }
}
