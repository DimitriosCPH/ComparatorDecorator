/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatordecorator;

import java.util.Comparator;

/**
 *
 * @author Dell
 */
public abstract class ComparatorDecorator extends IntComparator
{
    protected Comparator c;
    
    public ComparatorDecorator(Comparator c)
    {
        this.c = c;
    }
    
    @Override
    public int compare(Integer o1 , Integer o2)
    {
        return c.compare(o1, o2);
    }
}
