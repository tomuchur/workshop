package team.jit;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> rands = new Random().ints(30, 0, 30).boxed().collect(Collectors.toList());

        Map<Integer, Long> counts = rands.stream()
                .parallel()
                .filter(i -> i > 20)
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()));



        Map<Integer, Long> counts2 = rands.stream()
                .parallel()
                .filter(i -> i > 20)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        counts.entrySet().stream().forEach(System.out::println);
        System.out.println("----------------------------------");
        counts2.entrySet().stream().forEach(System.out::println);

    }
}