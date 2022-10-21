package Reference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Generator generator=SomeClass::sameDo;
        generator.doThis(new SomeClass());
        generator.doThis(new Dother());

        GenerateArray generateArray=int[]::new;
        generateArray.createArray(5);
        int[] test=generateArray.createArray(5);
        test[0]=1;
        System.out.println(Arrays.toString(test));


    }
}
