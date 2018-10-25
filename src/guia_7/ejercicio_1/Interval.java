package guia_7.ejercicio_1;

import java.util.Iterator;

public class Interval {
    private int[] interval;

    public Interval(int size){
        interval = new int[size];
        for (int i = 0; i < interval.length; i++) {
            interval[i] = i+1;
        }
    }

    public int first(){
        return interval[0];
    }

    public int last(){
        return interval[interval.length-1];
    }

    public int at(int i){
        return interval[i];
    }

    public int size(){
        return interval.length;
    }

    public Iterator<Integer> getIterator(){
        return new Iterator<Integer>() {
            int current=0;
            @Override
            public boolean hasNext() {
                if(current>=size()) return false;
                return true;
            }

            @Override
            public Integer next() {
                return at(current++);
            }
        };
    }
}
