package LV2;


import java.util.*;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int add = 0;
        for (int i =0; i< tangerine.length; i++) {
            int now = tangerine[i];
            map.put(now, map.getOrDefault(now, 0) + 1);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList);

        int idx = valueList.size() - 1;
        while (add < k) {
            add += valueList.get(idx);
            answer ++;
            idx --;

        }
        return answer;
    }
}
