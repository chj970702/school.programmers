import java.util.ArrayList;
import java.util.List;

public class 모의문제5 {
    public List<String> solution(String[] logs, String keyword) {
        List<String> result = new ArrayList<>();
        String upperKeyword = keyword.toUpperCase();
        for (String s : logs) {
            String upper = s.toUpperCase();
            if (upper.contains(upperKeyword)) {
                result.add(s);
            }
        }
        return result;
    }
}
