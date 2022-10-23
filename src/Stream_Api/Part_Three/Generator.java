package Stream_Api.Part_Three;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
    static int accum=0;


    public static void main(String[] args) {

        Stream<Integer> streamIntOne=Stream.generate(new TestSuppl()).limit(10);
        Stream<Integer> streamIntTwo=Stream.generate(RandomRange(50,100)).limit(10);

        Stream<Integer> streamIntThree=Stream.generate(stepByStep(10)).limit(20);
        List<Integer> stepList=streamIntThree.collect(Collectors.toList());

        List<Integer> resultList=Stream
                .concat(streamIntOne,streamIntTwo)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(resultList);

        Stream.iterate("*", n -> n + "*").limit(13).forEach(System.out::print);

        System.out.println("\n" + stepList);
    }

    static class TestSuppl implements Supplier<Integer>{
        @Override
        public Integer get() {
            return (int) (Math.random() * 10+1);
        }
    }

    public static Supplier<Integer> RandomRange(int startPos, int EndPos){
        class MyRandom implements Supplier<Integer> {
            @Override
            public Integer get() {
                return (int)(Math.random()*(EndPos-startPos)+1+startPos);
            }
        }
        return new MyRandom();
    }

    public static Supplier<Integer> stepByStep(int step){
        class Temp implements Supplier<Integer>{
            @Override
            public Integer get() {
                return accum+=step;
            }
        }
        return new Temp();
    }
}
