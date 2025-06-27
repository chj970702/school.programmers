import java.util.*;

public class DA2 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext의 idx 구하기
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        int idx = map.get(ext);
        
        // val_ext 보다 작은것들을 추리기
        List<int[]> list = new ArrayList<>();

        for (int i=0; i<data.length; i++) {
            if (data[i][idx] < val_ext) {
                list.add(data[i]);
            }
        }
        
        // sort_by로 정렬
        int sort_idx = map.get(sort_by);
        list.sort(Comparator.comparingInt(arr -> arr[sort_idx]));

        int[][] result = list.toArray(new int[list.size()][]);
        return result;


    }
}
