package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<score.length; i++) {
            int now = score[i];

            // 넣기
            if (i < k) {
                list.add(now);
            } else {
                if (now > list.get(0)) {
                    list.remove(0);
                    list.add(now);
                }
            }

            // 최하위 점수 넣기
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        return answer;
    }
}
