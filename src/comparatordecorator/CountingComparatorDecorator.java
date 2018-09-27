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
public class CountingComparatorDecorator extends ComparatorDecorator
{
    int count;
    public CountingComparatorDecorator(Comparator c)
    {
        super(c);
    }
    
    public int getCount()
    {
        return this.count;
    }
    @Override
    public int compare(Integer o1, Integer o2)
    {
        this.count++;
        return c.compare(o1,o2);
    }
    
    
}
