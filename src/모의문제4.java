import java.util.*;

public class 모의문제4 {
    public List<String> solution(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        List<String> result = new ArrayList<>();
        // 최대값 구하고
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value  = entry.getValue();
            max = Math.max(max, value);
        }
        // 최대값에 해당하는 key들을 찾음
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value  = entry.getValue();
            if (value == max) {
                result.add(key);
            }
        }
        // key들을 오름차순 정렬
        Collections.sort(result);
        return result;
    }
}
