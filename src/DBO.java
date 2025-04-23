// 바로성공 ㄷㄷ
public class DBO {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int upNum = num;
        while (upNum <= n) {
            if (num % w == 0) {
                upNum = num + 1;
            } else {
                upNum = num + 2 * (w - (num % w)) + 1;
            }
            answer += 1;
            num = upNum;
        }

        return answer;
    }
}
