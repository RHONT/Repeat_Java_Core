package Consumer.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SideEffect {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("1. Я хочу","мне","чтвло","штто 1"));
        List<String> sublist=new ArrayList<>();

        Consumer<String> stringConsumer=a->{
            if (a.replaceAll("\\D+","").length()>0) sublist.add(a);
        };
        list.forEach(stringConsumer);
        System.out.println(sublist);
    }
}
