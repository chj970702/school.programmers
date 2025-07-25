package LV2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=3; // 가로
        // x*y = brwon + yellow 임
        // x >= y
        int total = brown + yellow;
        while (true) {
            if (total % x == 0 && (x - 2) * (total/x - 2) == yellow && Math.pow(x, 2) >= total ) {
                break;
            }
            x++;
        }
        answer[0] = x;
        answer[1] = total/x;
        return answer;
    }
}
