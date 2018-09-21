package comparatordecorator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        CountingComparatorInterface<Integer> comparator = new NumberComparator();
        Integer[] numbers = new Integer[]{2, 3, 6, 1, 8, 5, 9, 10, 7, 4 ,11};
        Arrays.sort(numbers, comparator);
        System.out.println("Sorted list length "+numbers.length);
        for (Integer integer : numbers) {
            System.out.print(integer+" ");
        }
        System.out.println("\nNumber of comparisons: "+comparator.getCount());

    }
}