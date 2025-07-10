public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String alpha= "abcdefghijklmnopqrstuvwxyz";
        String answer = s;
        for (int i=0; i<s.length(); i++) {
            int idx = 0;
            for (int j=0; j<alpha.length(); j++) {
                if (s.charAt(i) == alpha.charAt(j)) {
                    idx = j;
                    break;
                }
            }
            int cnt = 0;
            while (true) {
                if (cnt == index) {
                    StringBuilder sb = new StringBuilder(answer);
                    sb.setCharAt(i, alpha.charAt(idx));
                    answer = String.valueOf(sb);
                    break;
                }
                // z까지 넘어가면 a로 돌아가야함
                if (25 < idx+1) {
                    idx = -1;
                }
                if (skip.contains(String.valueOf(alpha.charAt(idx+1)))) {

                } else {
                    cnt += 1;
                }
                idx += 1;
            }

        }

        return answer;
    }
}
