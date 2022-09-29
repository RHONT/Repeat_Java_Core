package Supplier.HomeWork.FindWord;

import java.util.function.Supplier;

public class WordString implements Supplier<String> {
    private int count=-1;
    private final String[] array;
    public WordString(String inputText) {
        array= inputText.split(" ");
    }

    public static void SequenceWord(Supplier<String> wordStringint, int increment){
        for(int i=0;i<increment;i++) System.out.println(wordStringint.get());;
    }

    @Override
    public String get() {
        count++;
//        if (count<array.length){
//            return array[count];
//        }
//        return "Пустая строка";
//        Рефактор
        return (count<array.length?array[count]:"Пустая строка");
    }



}
