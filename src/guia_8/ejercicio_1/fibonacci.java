package guia_8.ejercicio_1;

import java.util.HashMap;

public class fibonacci {
    HashMap<Long, Long> map = new HashMap<>();

    public long fibonacciMap(long n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        if ( n == 0 || n == 1)
            return 1;
        long result = fibonacciMap(n-1) + fibonacciMap(n-2);
        map.put(n, result);
        return result;
    }
}
