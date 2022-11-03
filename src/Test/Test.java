package Test;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        Test.Voider vd = new Voider(5);

        for (; vd.flag; ) {
            vd.accept();
        }


    }


    static class Voider {
        private boolean flag = true;
        private final int max;
        int count = 0;

        public Voider(int max) {
            this.max = max;
        }

        public void accept() {
            if (flag) {
                System.out.println(++count);
                if (count >= max) {
                    flag = false;
                }
            }
        }
    }


}
