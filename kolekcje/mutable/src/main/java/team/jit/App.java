package team.jit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
@Data
@AllArgsConstructor
class A {
    int a;
    int b;

}

public class App 
{
    public static void main( String[] args )
    {
        A a0 = new A(1,10);
        A a1 = new A(2_000_000, 10);

        Set<A> set = new HashSet<>();
        set.add(a0);

        a0.setA(2_000_000);

        set.add(a1);

        System.out.println("set size is: " + set.size());
        for (A a: set) {
            System.out.println(a);
        }
    }
}
