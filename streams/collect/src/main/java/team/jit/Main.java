package team.jit;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intSet = IntStream.of(10, 80, 100,1,3,5,2,6,7,4)
                .boxed()
                .map(i -> i * 2)
                .collect(Collectors.toCollection(TreeSet::new));

        // jak oddac TreeSet'a ?
        System.out.println(intSet);

    }
}