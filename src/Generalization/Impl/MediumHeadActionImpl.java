package Generalization.Impl;

import Generalization.Intarfase.HeadActions;

public class MediumHeadActionImpl implements HeadActions {
    @Override
    public void action() {
        System.out.println("I eat enemy");
    }

    @Override
    public void attack() {
        System.out.println("Зубы вперед");
    }

    @Override
    public <T extends String> void test(T t) {
        System.out.println(t);
    }
}
