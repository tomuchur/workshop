package team.jit;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Tomek", "Maciej", "Kasia", "Ania", "Piotr", "Agata");

        //TODO: add supplier
        names.map(String::toUpperCase).forEach(System.out::println);
        names.map(String::toLowerCase).forEach(System.out::println);
    }
}