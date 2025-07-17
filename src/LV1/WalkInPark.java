package LV1;

// LV1.공원 산책
public class WalkInPark {

    private static final int[][] DIRS = {
            {0, 1},     // E
            {0, -1},    // W
            {1, 0},     // S
            {-1, 0}     // N
    };
    private static final String[] DIR_NAMES = {"E", "W", "S", "N"};

    public int[] solution(String[] park, String[] routes) {
        int[] now = {0,0};
        // 시작 위치 잡기
        for (int i=0; i<park.length; i++) {
            int idx = park[i].indexOf("S");
            if (idx != -1) {
                now = new int[]{i, idx};
                break;
            }
        }

        // 이동하기
        for (String route : routes) {
            String parts[]  = route.split(" ");
            String dir      = parts[0];
            int dist        = Integer.parseInt(parts[1]);
            int dirIdx      = getDirIdx(dir);
            int dy          = DIRS[dirIdx][0];
            int dx          = DIRS[dirIdx][1];
            
            // 현재 위치
            int ny = now[0];
            int nx = now[1];
            
            // 패스여부
            boolean valid = true;
            
            for (int i = 1; i <= dist; i++) {
                ny += dy;
                nx += dx;
                
                // 위치가 LV1.공원 넘어가거나, 장애물 만났는지 확인
                if (ny < 0 || ny > park.length - 1 || nx < 0 || nx > park[0].length() -1 || park[ny].charAt(nx) == 'X') {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                now[0] = ny;
                now[1] = nx;
            }
        }
        return now;
    }

    private int getDirIdx(String dir) {
        for (int i = 0; i < DIR_NAMES.length; i++) {
            if (dir.equals(DIR_NAMES[i])) {
                return i;
            }
        }
        return 0;
    }
}
