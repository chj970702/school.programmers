import java.util.ArrayList;
import java.util.List;

public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    list.add(new int[]{i, j});
                }
            }
        }
        int min_y = wallpaper[0].length() - 1;
        int max_y = 0;
        int min_x = wallpaper.length - 1;
        int max_x = 0;
        for (int i = 0; i < list.size(); i++) {
            min_y = Math.min(min_y, list.get(i)[1]);
            max_y = Math.max(max_y, list.get(i)[1]);
            min_x = Math.min(min_x, list.get(i)[0]);
            max_x = Math.max(max_x, list.get(i)[0]);
        }
        return new int[]{min_x, min_y, max_x + 1, max_y + 1};
    }
}
