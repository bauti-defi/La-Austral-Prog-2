package guia_8.ejercicio_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fibonacciTest {
    @Test
    public void test001_fibonacciMap(){
        fibonacci some = new fibonacci();

        assertEquals(165580141,some.fibonacciMap(40));
    }
}