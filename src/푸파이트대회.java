import java.util.ArrayList;
import java.util.List;

public class 푸파이트대회 {
    public String solution(int[] food) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<food.length; i++) {
            int mok = food[i] / 2;
            if (mok > 0) {  // 2 이상
                for (int j=0; j<mok; j++) {
                    list.add(i);
                }
            }
        }
        list.add(0);
        for (int i=list.size()-2; i>=0; i--) {
            list.add(list.get(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int val : list) {
            sb.append(val);
        }
        return sb.toString();
    }
}
