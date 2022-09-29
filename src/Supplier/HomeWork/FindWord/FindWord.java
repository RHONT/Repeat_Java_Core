package Supplier.HomeWork.FindWord;


import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

// При вызовое поставщика, выводить слово из вводимой строки
public class FindWord {
    public static void main(String[] args) {
        String inputText="Мама мыла раму под окном. И ела пельмени";

        Supplier<String> wordSequenceSuppl=new WordString(inputText);
//        System.out.println(wordSequenceSuppl.get());
//        System.out.println(wordSequenceSuppl.get());
//        Рефактор
        WordString.SequenceWord(wordSequenceSuppl,10);


    }
}
