package Strategy;


import java.util.function.Supplier;

/**
 * Смысл стратегии изменять состояние объекта в клиентском коде, если состояние меняеться внутри объекта(Instance of),
 * то это шаблон состояние
 * Есть хомяк
 * Мы ему присваеваем одну из двух моделей поведения, которые он потом и реализует
 * Есть и спать
 * Решил Через поставщика создать методы.
 * Глубинного смысла нет, просто для выработки мышечной памяти.
 * Как я понял один объект может выполнять множество сценариев.
 * И отсюда я вижу нарушение принципа единой ответственности.
 * Или же объект служит аналогом перекрестка для других классов
 * И переключая свое состояние он дает зеленый свет работе какого то, объекта.
 */
public class RunProgramm {
    public static void main(String[] args) {
        Supplier<Hamster> sup=Hamster::new;
        Supplier<Sleep> sleepsupplier=Sleep::new;
        Supplier<Eat> eatSupplier=Eat::new;
        Hamster hamster=sup.get();
        hamster.setAction(sleepsupplier.get());
        hamster.doSomthing();
        hamster.setAction(eatSupplier.get());
        hamster.doSomthing();

    }
}
