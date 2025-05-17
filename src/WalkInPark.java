// 공원 산책
public class WalkInPark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] now = {0,0};
        // 시작 위치 잡기
        for (int i=0; i<park.length; i++) {
            int idx = park[i].indexOf("S");
            if (idx != -1) {
                now = new int[]{i, idx};
            }
        }
        // 이동하기
        for (int i=0; i<routes.length; i++) {
            now = _after(now, routes[i], park);
        }
        return now;
    }

    private int[] _after(int[] now, String route, String[] park) {
        int[] before = new int[]{now[0], now[1]};
        String[] parts = route.split(" ");
        String direction = parts[0];
        int distance = Integer.parseInt(parts[1]);

        int nowWidth  = now[1];
        int nowHeight = now[0];
        int maxWidth = park[0].length() - 1;
        int maxHeight = park.length - 1;
        boolean possible = true;
        switch (direction) {
            case "E":
                for (int i=1; i<=distance; i++) {
                    // 공간 넘었는지 확인
                    if (now[1] + 1 > maxWidth) {
                        possible = false;
                        break;
                    }
                    // 장애물 만났는지 확인
                    else if (park[nowHeight].charAt(now[1]+1) == 'X') {
                        possible = false;
                        break;
                    } else {
                        now[1] += 1;
                    }
                }
                break;
            case "W":
                for (int i=1; i<=distance; i++) {
                    if (now[1] - 1 < 0) {
                        possible = false;
                        break;
                    }
                    else if (park[nowHeight].charAt(now[1]-1) == 'X') {
                        possible = false;
                        break;
                    } else {
                        now[1] -= 1;
                    }
                }
                break;
            case "N":
                for (int i=1; i<=distance; i++) {
                    if (now[0] - 1 < 0) {
                        possible = false;
                        break;
                    }
                    else if (park[now[0]-1].charAt(nowWidth) == 'X') {
                        possible = false;
                        break;
                    } else {
                        now[0] -= 1;
                    }
                }
                break;
            case "S":
                for (int i=1; i<=distance; i++) {
                    if (now[0] + 1 > maxHeight) {
                        possible = false;
                        break;
                    }
                    else if (park[now[0]+1].charAt(nowWidth) == 'X') {
                        possible = false;
                        break;
                    } else {
                        now[0] += 1;
                    }
                }
                break;
        }
        if (possible) {
            return now;
        }
        return before;
    }
}
