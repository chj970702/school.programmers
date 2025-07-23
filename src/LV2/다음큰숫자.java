package LV2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int s = n;
        int nOneCnt = 0;
        String binaryN = Integer.toBinaryString(n);
        for (char c : binaryN.toCharArray()) {
            if (c == '1') {
                nOneCnt ++;
            }
        }
        while (true) {
            s++;
            int sOneCnt = 0;
            String binaryS = Integer.toBinaryString(s);
            for (char c : binaryS.toCharArray()) {
                if (c == '1') {
                    sOneCnt ++;
                }
            }
            if (nOneCnt == sOneCnt) {
                answer = s;
                break;
            }
        }

        return answer;
    }
}
