package Supplier;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class Example_04_PrimitiveSupplier {
    public static void main(String[] args) {

        IntSupplier intSupplier= new RandomGenerator(10,30);
        int [] array=new int[60];
        for (int i=0;i< array.length;i++){
            array[i]= intSupplier.getAsInt();
        }
        System.out.println(Arrays.toString(array));
    }

}

class RandomGenerator implements IntSupplier{
    private final int min;
    private final int max;

    public RandomGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int getAsInt() {
        return (int)(min+Math.random()*(max-min));
    }
}
