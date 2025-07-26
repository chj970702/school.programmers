package LV2;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        int lcm = arr[0];
        int idx = 0;
        while (idx < arr.length - 1) {
            int gcd = getGcd(lcm, arr[idx+1]);
            lcm = lcm * arr[idx+1] / gcd;
            idx ++;
        }
        return lcm;
    }
    private int getGcd(int a, int b){
        if (a % b == 0) {
            return b;
        } else {
            return getGcd(b, a%b);
        }
    }
}
