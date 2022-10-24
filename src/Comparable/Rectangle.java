package Comparable;

import java.util.Objects;


public class Rectangle implements Comparable<Rectangle> {
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
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
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public int compareTo(Rectangle o) {
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
