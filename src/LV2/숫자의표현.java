package LV2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int k = 1;
        while (n - k*(k-1)/2 > 0) {
            if ((n - k*(k-1)/2) % k == 0) {
                answer ++;
            }
            k ++;
        }
        return answer;
    }
}
