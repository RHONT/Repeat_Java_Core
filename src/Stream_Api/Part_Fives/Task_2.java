package Stream_Api.Part_Fives;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Реализуйте возможность выбора из списка языков программирования (пример в лекции)
 * язык с заданной сложностью обучения. Верните любой из обладающих нужной
 * сложностью.
 */
public class Task_2 {
    public static void main(String[] args) {

        ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
        ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
        ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);

        Predicate<ProgrammingLanguage> predicate = findNeedLang(DifficultyLevel.EASY);

        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        Optional<ProgrammingLanguage> resultLang = languages.stream().filter(predicate).findFirst();
        resultLang.ifPresent(System.out::println);


    }

    static Predicate<ProgrammingLanguage> findNeedLang(DifficultyLevel difficultyLevel) {

        class checkLang implements Predicate<ProgrammingLanguage> {
            @Override
            public boolean test(ProgrammingLanguage programmingLanguage) {
                if (programmingLanguage.getComplexity() == difficultyLevel)
                    return true;
                return false;
            }
        }
        return new checkLang();
    }
}


enum DifficultyLevel {
    EASY, MEDIUM, HARD;
}

class ProgrammingLanguage {
    private String name;
    private DifficultyLevel complexity;

    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public DifficultyLevel getComplexity() {
        return complexity;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
    }
}