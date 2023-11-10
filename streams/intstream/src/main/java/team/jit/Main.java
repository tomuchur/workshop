package team.jit;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("a1", "a2", "b3", "c4", "d5");
        int sum = strings.stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);


        IntStream.of(1,2,3,4,5,6);
        IntStream.range(1, 7);

        IntStream.range(0, 100).forEach(System.out::println);

    }






}