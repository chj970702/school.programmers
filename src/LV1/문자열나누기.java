package LV1;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        int i = 0;
        int len = s.length();

        while (i < len) {
            char x = s.charAt(i);
            int same = 1;
            int diff = 0;
            int j = i + 1;

            while (j < len) {
                if (s.charAt(j) == x) same++;
                else diff++;
                if (same == diff) break;
                j++;
            }

            answer++;
            i = j + 1;  // 다음 그룹 시작 인덱스
        }

        return answer;
    }
}
