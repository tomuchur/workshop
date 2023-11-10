package team.jit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

/**
 * Hello world!
 *
 */


@Data
@AllArgsConstructor
class A {
    int fieldA;
    int fieldB;
}

public class App
{
    public static void main( String[] args )
    {
        A a0  = new A(1,2);
        A a1 = new A(1, 200);

        TreeSet<A> treeSet = new TreeSet<>(Comparator.comparing(A::getFieldA));

        treeSet.add(a0);
        treeSet.add(a1);

        System.out.println("tree set size is: " + treeSet.size());

        treeSet.forEach(System.out::println);
    }
}
