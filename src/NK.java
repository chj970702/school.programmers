// 이웃한 칸
public class NK {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n   = board.length;
        int cnt = 0;    // 같은 색으로 색칠된 칸의 갯수
        int [] dh = {0, 1, -1, 0};
        int [] dw = {1, 0, 0, -1};
        for (int i=0; i<4; i++) {
            int h_check = h+dh[i];
            int w_check = w+dw[i];
            if ((0 <= h_check && h_check < n) && (0 <= w_check && w_check < n)) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
}
