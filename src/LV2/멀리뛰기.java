package LV2;

public class 멀리뛰기 {
    public long solution(int n) {
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i=0; i<n-1; i++) {
            fib[i+2] = (fib[i] + fib[i+1]) % 1234567;
        }
        return fib[n];
    }

}
