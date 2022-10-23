package Stream_Api.Part_Three;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создайте текстовый файл с url адресами. Используя Stream API выделите только те адреса
 * которые являются доступными на текущий момент.
 */
public class Task_1 {
    public static void main(String[] args) {
        final String path="C:\\Users\\rg915\\IdeaProjects\\G\\Repeat\\src\\Stream_Api\\Part_Three\\URL adress.txt";
        List<String> resultString = null;

        try {
            resultString = Files.lines(Path.of(path))
                    .filter(Task_1::checkUrltoConnect)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(resultString);

    }

    static boolean checkUrltoConnect(String checkingUrl){
        HttpURLConnection connection=null;
        try {
            URL url=new URL(checkingUrl);
            connection= (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            if (connection.getResponseCode()==200) return true;

        } catch (MalformedURLException e) {
//            e.printStackTrace();
            System.out.println("Нет доступа к ресурсу" + checkingUrl);
        } catch (IOException e) {
//            e.printStackTrace();
        }
        finally {
            if (connection!=null){
                connection.disconnect();
            }
        }
        return false;
    }
}
