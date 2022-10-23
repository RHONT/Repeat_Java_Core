package Stream_Api.Part_Three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * На основе адреса каталога выделите список файлов с расширением «txt».
 */
public class Task_3 {
    public static void main(String[] args) throws IOException {

        Path path=Path.of("C:\\Users\\rg915\\IdeaProjects\\G\\Repeat\\src\\Stream_Api\\Part_Three");

        List<String> txt= Files.list(path)
                .map(a->a.getFileName().toString())
                .filter(a->a.endsWith(".txt"))
                .collect(Collectors.toList());

        System.out.println(txt);

    }
}
