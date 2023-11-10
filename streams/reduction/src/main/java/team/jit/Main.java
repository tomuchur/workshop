package team.jit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Student {
    int id;
    String name;
    String surename;
    double score;
    String group;
    int salary;
}


public class Main {


    public static void main(String[] args) {
        Student reachestStudent = getStudents().reduce((student, student2) -> student.getSalary() > student2.getSalary() ? student: student2).orElse(null);

        Student reachestStudent2 = getStudents().max(Comparator.comparingInt(Student::getSalary)).orElse(null);

        System.out.println(reachestStudent);
        System.out.println(reachestStudent2);
    }

    private static Stream<Student> getStudents() {
        return Stream.of(
                new Student(0,"Jakub", "Jakubowski", 5.0, "A", 499),
                new Student(1,"Maciej", "Maciejewski", 4.0, "A", 300),
                new Student(2,"Agnieszka", "Nowak", 5.0, "B", 500),
                new Student(3,"Tomasz", "Tomaszewski", 2.4, "B", 0),
                new Student(4,"Katarzyna", "Katarzyńska", 3.6, "C", 200),
                new Student(5,"Krystyna", "Krystynowska", 3.6, "C", 200)
        );
    }
}