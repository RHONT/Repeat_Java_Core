package Stream_Api.Part_One;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

/**
 * Используя Stream API верните адрес файла с максимальным размером в заданном
 * каталоге.
 */
public class Task_3 {
    public static void main(String[] args) {
        try {
            Path maxPath= Files.list(Path.of("D:\\Рабочая\\2022\\Октрябрь\\19\\")).
                    max(Comparator.comparingLong((a)->a.toFile().length())).get();
            System.out.println(maxPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
