package Generalization.Intarfase;

import Generalization.Base.HeadWork;

import java.util.function.Supplier;

public interface HeadActions {
    void action();
    void attack();
    <T extends String> void test(T t);

    default <T> void testArray(T t) {

    }

    default <T extends String> Integer reformat(T t){
        System.out.println("Строка преобразована в число!");
        return Integer.valueOf(t);
    }

    default <T> T goInt(T t){
        Supplier<T> sup = ()->t;

        return sup.get();
    }
}
