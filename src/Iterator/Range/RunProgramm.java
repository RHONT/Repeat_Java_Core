package Iterator.Range;

import java.util.Iterator;

/**
 * Данный пример реализует рейнж, но городить такой огород стоит только если в
 * методе next(),hasNext() есть какая-то хитрая логика, иначе смысла нет.
 */
public class RunProgramm {
    public static void main(String[] args) {
        // явно создаем объект
//        Range range=new Range(10,20);
//        for (Integer integer : range) {
//            System.out.println(integer);
//        }

        // используем статический метод создания объекта
        for (int i:Range.fromTo(10,50)){
            System.out.println(i);
        }

    }
    private static class Range implements Iterable<Integer>{
        int start;
        int end;

        // создаем такой конструктор, чтобы прямо не создавать объект
        public static Range fromTo(int from, int to) {
            return new Range(from,to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iter(start);
        }

        class Iter implements Iterator<Integer>{
            int current;

            public Iter(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                // усложняю условие ради усложнения
                return current<=end-10;
            }

            @Override
            public Integer next() {
                //усложняю условие ради усложнения
                return current+=2;
            }
        }
    }
}

