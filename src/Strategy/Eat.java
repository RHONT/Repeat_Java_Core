package Strategy;

import java.util.stream.IntStream;

public class Eat implements Action{
    @Override
    public void doSomthing() {
        System.out.println("Начало активности Eat");
        System.out.println("Я ем! Значит живу! \n А еще я умный могу выдавать сразу после еды массивы!");
        IntStream.of(1,2,3,4).forEach(System.out::println);
    }
}
