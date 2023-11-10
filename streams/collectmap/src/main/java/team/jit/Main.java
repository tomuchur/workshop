package team.jit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
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
        //toMapById();
        //toMapByGroup();
        //groupByGroup();
        //averageScoreTotal();
        //averageScoreByGroup();
        //stunetsWithMaxScore();
        //merge();
        //partition();





    }

    private static void toMapById() {
        Map<Integer, Student> studentMap = getStudents()
                .collect(Collectors.toMap(Student::getId, Function.identity()));

        print(studentMap);

    }

    private static void toMapByGroup() {
        Map<String, Student> studentMap = getStudents()
                .collect(Collectors.toMap(Student::getGroup, Function.identity()));

        print(studentMap);

    }

    private static void groupByGroup() {
        Map<String, List<Student>> studentMap = getStudents()
                .collect(Collectors.groupingBy(Student::getGroup));

        print(studentMap);

    }

    private static void averageScoreTotal() {
        Double average = getStudents()
                .collect(Collectors.averagingDouble(Student::getScore));

        System.out.println("Average: " + average);

    }


    private static void averageScoreByGroup() {
        Map<String, Double> averageMap = getStudents()
                .collect(Collectors.groupingBy(Student::getGroup,  Collectors.averagingDouble(Student::getScore)));

        print(averageMap);

    }

    private static void stunetsWithMaxScore() {
        Map<String, Optional<Student>> averageMap = getStudents()
                .collect(Collectors.groupingBy(Student::getGroup,  Collectors.maxBy(Comparator.comparingDouble(Student::getScore))));

        print(averageMap);

    }

    private static void merge() {
        Map<String, Integer> salaries =  Stream.concat(getStudents(), getStudents2())
                .collect(Collectors.toMap(Student::getGroup, Student::getSalary, (s0, s1) ->  s0 + s1, HashMap::new));

        print(salaries);

    }

    private static void partition() {
        final int chunkSize = 3;
        final List<Integer> integers =
                Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);

        AtomicInteger counter = new AtomicInteger(0);

        List<List<Integer>> partition =
                integers
                        .stream()
                        .collect(Collectors.groupingBy(integer -> counter.getAndIncrement()/chunkSize))
                        .entrySet()
                        .stream()
                        .map(Map.Entry::getValue)
                        .collect(Collectors.toList());


        System.out.println(partition);
    }


    private static Stream<Student> getStudents() {
        return Stream.of(
                new Student(0,"Jakub", "Jakubowski", 5.0, "A", 500),
                new Student(1,"Maciej", "Maciejewski", 4.0, "A", 300),
                new Student(2,"Agnieszka", "Nowak", 5.0, "B", 500),
                new Student(3,"Tomasz", "Tomaszewski", 2.4, "B", 0),
                new Student(4,"Katarzyna", "Katarzyńska", 3.6, "C", 200),
                new Student(5,"Krystyna", "Krystynowska", 3.6, "C", 200)
        );
    }

    private static Stream<Student> getStudents2() {
        return Stream.of(
                new Student(0,"Jacek", "Jackowski", 5.0, "A", 500),
                new Student(1,"Andrzej", "Andrzejewski", 4.0, "D", 300)

        );
    }

    private static void print(Map<?,?> map) {
        map.entrySet().forEach(System.out::println);
    }
}