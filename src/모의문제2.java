import java.util.*;

public class 모의문제2 {
    public List<String> solution(String[] emails) {
        Set<String> set = new HashSet<>(Arrays.asList(emails));
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
