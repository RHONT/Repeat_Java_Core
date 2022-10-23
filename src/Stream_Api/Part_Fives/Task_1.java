package Stream_Api.Part_Fives;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
 * из каталогов в котором расположено более 3-х текстовых файлов.
 */
public class Task_1 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\rg915\\IdeaProjects\\G\\Repeat\\src\\Stream_Api\\Part_Fives\\Dirs.txt");

        Optional<String> first = Files.lines(path).filter(new FindPath()).findFirst();

        first.ifPresent(System.out::println);
    }
}

class FindPath implements Predicate<String>{
    boolean result;
    @Override
    public boolean test(String path) {
        try {
            result = Files.list(Path.of((path))).map(a->a.getFileName().toString()).filter(a -> a.endsWith(".txt")).count()>2;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
