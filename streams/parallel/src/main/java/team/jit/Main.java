package team.jit;

import org.apache.commons.lang3.time.StopWatch;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final int  SIZE = 50_000;
    private static final int MAX_VALUE = 50_000;
    private static final int TRIES = 1000;

    public static void main(String[] args) {

        List<List<Integer>> candidates = getRanomList();

        System.out.println("Counting uniquness sequentially");
        countBestUniqeness(candidates.stream());

        System.out.println("");
        System.out.println("Counting uniquness in parallel");
        countBestUniqeness(candidates.parallelStream());


    }

    private static long countBestUniqeness(Stream<List<Integer>> ints) {
        StopWatch stopWatch = new StopWatch("uniques");
        stopWatch.start();

        long max = ints.map(list -> list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .values()
                        .stream()
                        .mapToLong(Long::valueOf)
                        .filter(c -> c == 1)
                        .sum()
                )
                //.peek(System.out::println)
                .max(Comparator.comparingLong(Long::valueOf))
                .orElse(-1L);
        stopWatch.stop();

        System.out.printf("Fount best unique count %s in %s", max, stopWatch.formatTime());

        return max;
    }

    private static List<List<Integer>> getRanomList() {
        List<List<Integer>> candidates = new ArrayList<>();

        for (int i = 0; i < TRIES; i++) {
            candidates.add(new Random().ints(SIZE, 0, MAX_VALUE+1).boxed().collect(Collectors.toList()));
        }

        return candidates;
    }
}