public class 크기가작부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long p_num = 0;
        for (int i = 0; i<size; i++) {
            p_num += Long.parseLong(String.valueOf(p.charAt(i))) * Math.pow(10, size - i -1);
        }
        for (int i = 0; i<t.length() - p.length() + 1; i++) {
            String val = t.substring(i, i+size);
            long num = 0;
            for (int j=0; j<size; j++) {
                num += Long.parseLong(String.valueOf((val.charAt(j)))) * Math.pow(10, size - j - 1);
            }
            if (num <= p_num) {
                answer += 1;
            }
        }

        return answer;
    }
}
