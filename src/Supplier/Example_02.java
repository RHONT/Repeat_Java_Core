package Supplier;

import java.util.function.Supplier;

public class Example_02 {
    public static void main(String[] args) {
        Supplier<Integer> sup1=()->(int)(Math.random()*10);
        Supplier<Integer> sup2=Example_02::getRandomInteger;
        System.out.println(sup1.get());
        System.out.println(sup2.get());
    }
    static Integer getRandomInteger(){
        return (int)(Math.random()*10);
    }
}
