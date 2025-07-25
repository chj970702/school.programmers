package LV2;

public class 점프순간이동 {
    public int solution(int n) {
        int ans = 0;
        while (n != 0) {
            // n이 짝수 -> 순간이동으로 옴
            if (n % 2 == 0) {
                n = n/2;
            }
            // n이 홀수 -> 점프해서 옴
            else {
                n = n-1;
                ans ++;
            }
        }
        return ans;
    }
}
