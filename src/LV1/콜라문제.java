package LV1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newCola = (n / a) * b;
            answer += newCola;
            n = (n % a) + newCola;  // 남은 병 + 새로 마신 콜라병 = 다음 빈병 수
        }
        return answer;
    }
}
