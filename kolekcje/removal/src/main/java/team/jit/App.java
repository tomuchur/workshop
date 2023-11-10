package team.jit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //TODO: Remove all "9" Try. by value, index, iterator
        List<String> numsStr = new ArrayList<>();
        numsStr.add("3");
        numsStr.add("2");
        numsStr.add("9");
        numsStr.add("9");


        Iterator<String> iterator  = numsStr.iterator();

        while (iterator.hasNext()) {
            if ("9".equals(iterator.next())) {
                iterator.remove();
            }
        }
        numsStr.forEach(System.out::println);

    }
}
