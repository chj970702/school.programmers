package LV2;

import java.util.ArrayList;
import java.util.List;

public class Jaden {
    public String solution(String s) {
        String answer = "";
        boolean isStart = true;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer += ch;
                isStart = true;
            } else {
                if (isStart) {
                    answer += Character.toUpperCase(ch);
                    isStart = false;
                } else {
                    answer += Character.toLowerCase(ch);
                }
            }
        }
        return answer;
    }
}
