package Consumer.HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

/**
 * Реализуйте BiConsumer<String, File> добавляющий строку в конец файла указанного в
 * качестве параметра.
 */
public class Task_3 {
    public static void main(String[] args) {
        File f=new File("run.txt");
        BiConsumer<String,File> biConsumer=(a,b)->{
            try {
                FileWriter writer=new FileWriter(b,true);
                writer.append('\n');
                writer.write(a);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
             System.out.println("Операция закончилась");
            }
        };
        biConsumer.accept("Привет",f);

    }
}
