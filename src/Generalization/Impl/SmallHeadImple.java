package Generalization.Impl;

import Generalization.Intarfase.HeadActions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SmallHeadImple implements HeadActions {
    @Override
    public void action() {
        System.out.println("Burn!");
    }

    @Override
    public void attack() {
        System.out.println("Стреляю из глаз");
    }

    @Override
    public <T extends String> void test(T t) {
        System.out.println(t);
    }

    @Override
    public <T> void testArray(T t) {

        Arrays.stream((int[]) t).forEach(System.out::print);

    }
}
