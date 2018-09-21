package comparatordecorator;

import java.util.Comparator;

public interface CountingComparatorInterface<I> extends Comparator<I>
{
    int getCount();
}
