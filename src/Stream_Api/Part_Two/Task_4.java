package Stream_Api.Part_Two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для указания
 * зависимостей)
 * Поместите эти строки в массив строк, создайте поток на его основе и выделите значения в теге <groupid> и
 * соберите результат в список строк.
 */
public class Task_4 {
    public static void main(String[] args) {
        List<String> report=new ArrayList<>();
        try {
            report=Files.lines(Path.of("D:\\My_education_Java\\Repeat_Java_Core\\src\\Stream_Api\\Part_Two\\Pom.xml"))
                    .map(String::trim).
                    filter(a -> a.startsWith("<groupId>"))
                    .map(a->a.replaceAll("<groupId>|</groupId>",""))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        report.forEach(System.out::println);
        //[junit, org.powermock]

    }
}
