package Stream_Api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Part_Nines {
    public static void main(String[] args) {
        List<String> command = new ArrayList<>(List.of("1", "2", "3", "4"));

        File file = new File("passage.txt");

        command.forEach(rightThemInFile(file));
    }

    public static Consumer<String> rightThemInFile(File file) {

        class FileLogger implements Consumer<String> {
            @Override
            public void accept(String s) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                    pw.println(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return new FileLogger();
    }
}
