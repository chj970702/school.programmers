package LV2;

public class 서버증설횟수 {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int currentServer = 0;
        int[] expire = new int[24]; // 시간별 만료되는 서버 수
        for (int i=0; i<24; i++) {
            currentServer -= expire[i];
            int needServer = players[i] / m;
            // 필요서버가 현재 서버 수 보다 많다면
            if (needServer > currentServer) {;
                int add = needServer - currentServer;
                answer += add;
                currentServer += add;
                if (i+k < 24) expire[i+k] += add;
            }
        }
        return answer;
    }
}
