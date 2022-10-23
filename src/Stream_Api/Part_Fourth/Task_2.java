package Stream_Api.Part_Fourth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Из массива студентов (да тех самых из основного в д.з) выберите студентов старше 20 лет, и
 * отсортируйте их по фамилии. Результат поместите в список.
 */
public class Task_2 {
    public static void main(String[] args) {

        Student[] students1={
                new Student("Ivan","Dolgopolov",25),
                new Student("Gena","Jrank",17),
                new Student("Zarya","Mirolubov",15),
                new Student("Shpala","Srank",21),
                new Student("Ivan","Petrov",20),
                new Student("Robert","Frank",65),
                new Student("Ivan","Sidorov",45),
        };

        List<Student> students = Arrays.stream(students1)
                .filter(a -> a.age > 20)
                .sorted(Comparator.comparing(Student::getSurname))
                .collect(Collectors.toList());

        students.forEach(System.out::println);
    }
}
