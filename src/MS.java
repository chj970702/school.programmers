import java.util.Arrays;
import java.util.List;

// 추억 점수
public class MS {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> nameList = Arrays.asList(name);
        for (int i=0; i<photo.length; i++) {
            int score = 0;
            for (int j=0; j<photo[i].length; j++) {
                int idx = nameList.indexOf(photo[i][j]);
                // 점수가 있는 사람이면 점수 합산
                if (idx != -1) {
                    score += yearning[idx];
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
