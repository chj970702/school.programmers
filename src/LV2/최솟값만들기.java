package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 최솟값만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i=0; i<A.length; i++) {
            listA.add(A[i]);
            listB.add(B[i]);
        }
        Collections.sort(listA);
        Collections.sort(listB);

        for (int i=0; i<listA.size(); i++) {
            int j = listA.size()-i-1;
            answer += listA.get(i) * listB.get(j);
        }

        return answer;
    }
}
