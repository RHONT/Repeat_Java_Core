package Stream_Api.Part_Three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * На основе массива рок-исполнителей создайте список из первых (по алфавиту) трех песен.
 */
public class Task_2 {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Freddie Mercury", new String[] { "We Are the Champions", "Somebody to Love" });
        Singer singer2 = new Singer("David Bowie",new String[] { "Space Oddity", "Let Me Sleep Beside You", "Suffragette City" });
        Singer singer3 = new Singer("James Paul McCartney", new String[] { "Can’t Buy Me Love", "Another Girl" });

        Singer[] rockStars = new Singer[] { singer1, singer2, singer3 };

        List<String> threeSongs= Arrays.stream(rockStars)
                .flatMap(a-> Arrays.stream(a.getSongs()))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(threeSongs);

    }
}
