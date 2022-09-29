package Supplier.HomeWork.PrimitiveInt;

import java.util.function.IntSupplier;

public class GunSequence {
    public static void main(String[] args) {
        int [] array={1,3,4,5};
        IntSupplier intSupplier=new IntBox(array);
        System.out.printf("Выведено %s\n",intSupplier.getAsInt());
        System.out.printf("Выведено %s\n",intSupplier.getAsInt());
        System.out.printf("Выведено %s\n",intSupplier.getAsInt());
        System.out.printf("Выведено %s\n",intSupplier.getAsInt());
        System.out.printf("Выведено %s\n",intSupplier.getAsInt());
    }

    private static class IntBox implements IntSupplier {
        int incr=-1;
        int[] array;
        public IntBox(int[] array) {
            this.array=array;
        }

        @Override
        public int getAsInt() {
            incr++;
            return (incr< array.length?array[incr]:999);
        }
    }
}
