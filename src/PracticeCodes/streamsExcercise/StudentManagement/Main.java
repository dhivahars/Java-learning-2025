package PracticeCodes.streamsExcercise.StudentManagement;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", "IT", 85.5, 20),
                new Student(2, "Bob", "CSE", 70.2, 22),
                new Student(3, "Charlie", "IT", 92.3, 21),
                new Student(4, "David", "ECE", 65.0, 23),
                new Student(5, "Eva", "CSE", 78.5, 20)
        );
        System.out.println("\nStudents With Marks Greater Than 80");
        System.out.println("______________________________________");
        students.stream().filter(a->a.getMarks()>80)
                .forEach(System.out::println);
        System.out.println("\nStudents Names in UpperCase");
        System.out.println("______________________________________");
        students.stream().map(Student::getName).map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("\nStudent With Maximum Mark");
        System.out.println("______________________________________");
        students.stream().sorted((a,b)-> (int) (b.getMarks()-a.getMarks()))
                .map(Student::getName).limit(1)
                .forEach(System.out::println);
        System.out.println("\nStudents List in Descending order");
        System.out.println("______________________________________");
        students.stream().sorted((a,b)-> (int) ((b.getMarks()-a.getMarks()))).map(Student::getName).forEach(System.out::println);
        Map<String, Long> count=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        System.out.println("\nStudents Count by Department");
        System.out.println("______________________________________");
        System.out.println(count);
        Map<String, Double> avg=students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getMarks)));
        System.out.println("\nStudents average marks by Department");
        System.out.println("______________________________________");
        System.out.println(avg);

    }
}
