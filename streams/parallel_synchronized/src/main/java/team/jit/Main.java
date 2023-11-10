package team.jit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());


        IntStream.range(0, 100).parallel().forEach(i -> {
            list.add(i);
            System.out.println(list);
        });
    }
}