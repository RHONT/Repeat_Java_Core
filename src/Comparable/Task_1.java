package Comparable;

import java.util.Objects;

/**
 * Создайте класс прямоугольник, с двумя полями - длинной и высотой прямоугольника. Задайте
 * отношение естественного порядка для объектов этого класса (реализуйте интерфейс Comparable)
 * на основании площади этого прямоугольника. Используйте эту реализацию для сортировки массива
 * объектов класса прямоугольник.
 */
public class Task_1 implements Comparable<Task_1> {
    private int height;
    private int width;

    public Task_1(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Task_1{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task_1)) return false;
        Task_1 task_1 = (Task_1) o;
        return height == task_1.height && width == task_1.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public int compareTo(Task_1 o) {
        if (o==null) {
            throw new NullPointerException("Прямоугольник null!");
        }

        if (this.height*this.width>o.height*o.width) {
            return 1;
        }
        if (this.height*this.width<o.height*o.width) {
            return -1;
        }
        return 0;
    }

}
