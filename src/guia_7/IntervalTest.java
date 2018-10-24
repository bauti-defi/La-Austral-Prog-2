package guia_7;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class IntervalTest {
    @Test
    public void test001_IteratorShouldReturnTheFirstNumberOfTheInterval(){
        Interval some = new Interval(4);

        Iterator iterator = some.getIterator();

        assertEquals(1, iterator.next());
    }
}