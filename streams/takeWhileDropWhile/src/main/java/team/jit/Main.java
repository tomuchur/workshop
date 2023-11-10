package team.jit;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,20)
                .takeWhile(i -> i < 10)
                .forEach(System.out::println);
    }
}