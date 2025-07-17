public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            int lastWordIdx = 0;
            int idx = 0;
            while (idx < s.length()) {
                if (s.startsWith(can[0], idx) && lastWordIdx != 1) {
                    lastWordIdx = 1;
                    idx += can[0].length();
                } else if (s.startsWith(can[1], idx) && lastWordIdx != 2) {
                    lastWordIdx = 2;
                    idx += can[1].length();
                } else if (s.startsWith(can[2], idx) && lastWordIdx != 3) {
                    lastWordIdx = 3;
                    idx += can[2].length();
                } else if (s.startsWith(can[3], idx) && lastWordIdx != 4) {
                    lastWordIdx = 4;
                    idx += can[3].length();
                } else {
                    break;
                }
            }
            if (idx == s.length()) {
                answer ++;
            }
        }
        return answer;
    }
}
