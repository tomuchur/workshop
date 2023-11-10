package team.jit;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;

import java.util.Collection;
import java.util.List;
import java.util.Set;


public class App 
{
    public static void main( String[] args )
    {
        Collection<Integer> set0 = Set.of(1, 2, 4, 56, 45,23, 43,78, 9 );
        Collection<Integer> set1 = Set.of(1, 45, 44, 78, 32, 9 ) ;

        System.out.println("not empty " + CollectionUtils.isNotEmpty(set0));

        Collection<Integer> intersection = CollectionUtils.intersection(set0, set1);
        System.out.println(intersection);
        System.out.println("subtract " + CollectionUtils.subtract(set0, set1));
        System.out.println("contains all " + CollectionUtils.containsAll(set0, set1));
        System.out.println("contains any " + CollectionUtils.containsAny(set0, set1));


        System.out.println("partitions");
        List<Integer> toParition = List.of(1, 2, 3, 4, 5, 6, 12, 43, 56, 12, 45);
        List<List<Integer>> partition = ListUtils.partition(toParition, 3);

        partition.forEach(System.out::println);
    }
}
