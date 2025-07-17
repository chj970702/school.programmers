import LV2.서버증설횟수;

public class Main {
    public static void main(String[] args) {
        서버증설횟수 sol = new 서버증설횟수();
        int[] players = {0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        int m = 1;
        int k = 1;
        int result = sol.solution(players, m, k);
        
        System.out.println(result);
    }
}
