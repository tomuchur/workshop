package team.jit;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Stream.of(1,2,3,4).parallel()
                .reduce(0, (n0, n1) -> n0 + n1) + 10;

        int sum2 = Stream.of(1,2,3,4)
                .reduce(10, (n0, n1) -> n0 + n1);

        System.out.printf("sum parallel %s, sum sequential %s", sum, sum2);
    }
}