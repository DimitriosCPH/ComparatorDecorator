package comparatordecorator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args)
    {
        Comparator c = new IntComparator();
        CountingComparatorDecorator cd= new CountingComparatorDecorator(c);
        
        Integer[] numbers = new Integer[]{2, 3, 6, 1, 8, 5, 9, 10, 7, 4 ,11};
        
        Arrays.sort(numbers, cd);
        
        System.out.println("Sorted list length "+numbers.length);
        for (Integer integer : numbers) 
        {
            System.out.print(integer+" ");
        }
        System.out.println("\nNumber of comparisons: "+cd.getCount());

    }
}