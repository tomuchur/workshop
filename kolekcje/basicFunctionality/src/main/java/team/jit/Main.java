package team.jit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Collection<String> hashStrings = new HashSet<>();
        hashStrings.add("hello");
        hashStrings.add("goodbye");

        //easily convert different types of collections
        List<String> arrayStrings = new ArrayList<>(hashStrings);

        System.out.println("arrayStrings size: " + arrayStrings.size());
        System.out.println("arrayStrings is empty: " + arrayStrings.isEmpty());
        System.out.println("arrayStrings contains hello: " + arrayStrings.contains("hello"));
        System.out.println("arrayStrings contains world: " + arrayStrings.contains("world"));
        System.out.println("--------");

        arrayStrings.add("another string");
        arrayStrings.removeAll(hashStrings);

        arrayStrings.forEach(System.out::println);

    }
}
