package LV1;

import java.util.ArrayList;
import java.util.List;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (String target : targets) {
            int total_cnt = 0;
            boolean isPossible = true;
            for (int i=0; i<target.length(); i++) {
                Character now = target.charAt(i);
                int cnt = Integer.MAX_VALUE;

                for (int j=0; j<keymap.length; j++) {
                    for (int k=0; k<keymap[j].length(); k++) {
                        if (now == keymap[j].charAt(k)) {
                            cnt = Math.min(cnt, k + 1);
                        }
                    }
                }
                if (cnt == Integer.MAX_VALUE) {
                    isPossible = false;
                    break;
                }
                total_cnt += cnt;
            }
            if (isPossible) {
                list.add(total_cnt);
            } else {
                list.add(-1);
            }
        }
        // List<Integer>를 int[]로 변환
        int[] result = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
