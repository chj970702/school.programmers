package LV2;

public class 짝지어제거하기 {
    public int solution(String s) {
        int answer = -1;
        int i = 0;
        while (s.length() > 1 && i < s.length()-1) {
            char now = s.charAt(i);
            char compare = s.charAt(i+1);
            if (now == compare) {
                String front;
                if (i==0) front = "";
                else front = s.substring(0, i);
                String back  = s.substring(i+2);
                s = front + back;
                i = 0;
            } else {
                i++;
            }
        }

        if (s.length() == 0) answer = 1;
        else answer = 0;
        return answer;
    }
}
