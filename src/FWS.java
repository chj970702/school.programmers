public class FWS {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        int n = schedules.length;
        for (int i=0; i<n; i++) {
            boolean flag = true;
            for (int j=0; j<7; j++) {
                int day = j + startday;
                if (day != 6 && day != 7 && day != 13) {
                    int hour = schedules[i] / 100;
                    int minute = schedules[i] % 100;

                    minute += 10;
                    if (minute >= 60) {
                        hour += 1;
                        minute -= 60;
                    }
                    int due = hour * 100 + minute;

                    if (timelogs[i][j] > due) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) answer += 1;
        }
        return answer;
    }
}

5 6 7 8 9 10 11
6 7 8 9 10 11 12
7 8 9 10 11 12 13
