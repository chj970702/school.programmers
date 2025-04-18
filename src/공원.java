import java.util.Arrays;
import java.util.Collections;

public class 공원 {

    // mats : 돗자리 길이 정수 리스트
    // park : 공원 자리 배치도 2차원 문자열 리스트
    // answer : 가능한 가장 큰 돗자리 길이
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        int n = park.length;
        int m = park[0].length;
        int [][] arr = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (park[i][j].equals("-1")) arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }
        for (int size : mats) {
            for (int i=0; i<=n-size; i++) {
                for (int j=0; j<=m-size; j++) {
                    if (_canPlace(arr,i,j,size)) {
                        answer = Math.max(answer, size);
                    }
                }
            }
        }

        return answer;
    }

    private boolean _canPlace(int[][] arr, int x, int y, int size) {

        for (int i=x; i<x+size; i++) {
            for (int j=y; j<y+size; j++) {
                if (arr[i][j] == 1) return false;
            }
        }
        return true;
    }
}
