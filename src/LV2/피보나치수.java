package LV2;

import java.util.ArrayList;
import java.util.List;

public class 피보나치수 {
    public int solution(int n) {
        int start = 2;
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        while (start <= n) {
            fib[start] = (fib[start-1] + fib[start-2]) % 1234567;
            start ++;
        }
        return fib[n];
    }
}
