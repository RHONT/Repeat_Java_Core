package Predicat.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DeleteString {
    public static void main(String[] args) {
        // Удалить из списка имена начинающиеся на определнную букву
        String letter="F";
        List<String> listName=new ArrayList<>(List.of("Fury","Serge","Anton","Genacvili"));
        Predicate<String> predicate=(a)->a.startsWith(letter);
        listName.removeIf(predicate);
        System.out.println(listName);
        // Удалить из списка имена начинающиеся на определнную букву из массива вариантов
        String[] simbolForDel={"h","a","t"};
        List<String> listName2=new ArrayList<>(List.of(
                "Fury",
                "Serge",
                "Anton",
                "Genacvili",
                "Harrison",
                "Torvald",
                "Anna"));
        Predicate<String> predicate2=(a)->Arrays.asList(simbolForDel).contains(String.valueOf(Character.toLowerCase(a.charAt(0))));
        listName2.removeIf(predicate2);
        System.out.println(listName2);

    }

}
