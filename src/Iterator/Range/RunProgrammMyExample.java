package Iterator.Range;


import java.util.List;
import java.util.stream.IntStream;

public class RunProgrammMyExample {
    public static void main(String[] args) {
        Snake sn=new Snake("22");
        List<Snake> list= List.of(new Snake("1"),new Snake("1"),sn);
        for(Snake snake:list){
            System.out.println(snake);
        }
        for(int i: IntStream.rangeClosed(10,40).toArray()){
            System.out.println(i);
        }


    }

}
