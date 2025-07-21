package LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String num : nums) {
            list.add(Integer.parseInt(num));
        }
        Collections.sort(list);
        int max = list.get(list.size()-1);
        int min = list.get(0);

        answer += String.valueOf(min) + " ";
        answer += String.valueOf(max);

        return answer;
    }
}
