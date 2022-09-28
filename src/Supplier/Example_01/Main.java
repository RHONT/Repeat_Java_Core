package Supplier.Example_01;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        IntegerSequence counter=new IntegerSequence(0,1,10);
        Integer number;
        for (; (number= counter.get()) !=null   ;) {
            System.out.println(number);
        }
    }

}

class IntegerSequence implements Supplier<Integer> {
    int start,step,end;

    public IntegerSequence(int start, int step, int end) {
        this.start = start;
        this.step = step;
        this.end = end;
    }

    @Override
    public Integer get() {
        if (end<start) return null;
        start+=step;
        return (start-step);
    }
}
