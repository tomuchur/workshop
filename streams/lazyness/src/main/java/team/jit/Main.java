package team.jit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = List.of("John", "Marry", "George", "Paul", "Alice", "Ann");
        namesList.stream()
                .filter(e -> e.startsWith("A"))
                .peek(System.out::println)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}