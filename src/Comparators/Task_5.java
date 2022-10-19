package Comparators;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Создайте Comparator<File> для сортировки списка текстовых файлов по количеству знаков
 * препинания в них. При решении принять, что знаки препинания ограниченны символами {, . - ? !}
 * и символ пробел.
 */
public class Task_5 {
    static int length_o1;
    static int length_o2;
    public static void main(String[] args) {

        List<File> files=new ArrayList<>(List.of(
                new File("Первый файл..."),
                new File("!!Первый файл..."),
                new File("-Первый,,,,, файл..."),
                new File("-----------Первый файл..."),
                new File("!!Первый файл..."),
                new File("?!Первый файл...  много пробелов  !")));

        System.out.println("\n*********Before***********\n");
        for (File file:files) {
            System.out.println(file.getName());
        }

        Comparator<String> sortName=Task_5::sortByName;
        Comparator<File> sortFiles=Comparator.comparing(File::getName,sortName);

        files.sort(sortFiles);

        System.out.println("\n*********After***********\n");
        for (File file:files) {
            System.out.println(file.getName());
        }
    }

    public static int sortByName(String o1, String o2){

        length_o1=o1.replaceAll("[^,.\\-?! ]","").length();
        length_o2=o2.replaceAll("[^,.\\-?! ]","").length();

        if (length_o1<length_o2) { return 1; }
        if (length_o1>length_o2) { return -1; }

        return 0;
    }
}
