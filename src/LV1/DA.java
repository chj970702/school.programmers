package LV1;

import java.util.*;
import java.util.stream.Collectors;

// 데이터 분석
public class DA {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        List<int[]> result = new ArrayList<>();
        for (int i=0; i< data.length; i++) {
            int ext_idx = map.get(ext);
            // 작으면 answer에 추가
            if (data[i][ext_idx] < val_ext) {
                result.add(data[i]);
            }
        }
        // 추가 끝나면 정렬
        int sort_idx = map.get(sort_by);
        result.sort((a,b) -> Integer.compare(a[sort_idx], b[sort_idx]));

        // 다시 인트 배열로 변환
        answer =  result.toArray(new int[0][]);
        return answer;
    }
}
