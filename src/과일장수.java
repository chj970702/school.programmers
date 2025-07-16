import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        /**
         * k: 사과 최대 점수
         * m: 한 상자에 들어가는 사과 수
         * score: 사과 점수 배열
         */
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder()); // 4 4 4 4 4 4 2 2 2 2 1 1

        for (int i=0; i<score.length / m; i++) {
            answer += arr[i * m + (m - 1)] * m;
        }
        return answer;
    }
}
