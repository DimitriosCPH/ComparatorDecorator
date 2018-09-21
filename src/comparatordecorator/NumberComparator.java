package comparatordecorator;

public class NumberComparator implements CountingComparatorInterface<Integer>
{

    private int count = 0;

    @Override
    public int compare(Integer o1, Integer o2)
    {
        count++;
        return o1.compareTo(o2);
    }


    @Override
    public int getCount() {
        return count;
    }
}