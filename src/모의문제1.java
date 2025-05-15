import java.util.*;

public class 모의문제1 {
    public String[][] solution(String[] records) {
        // TODO: JAVA 9 이상부터 Map.of 사용 가능
        HashMap<String, Integer> pointRate = new HashMap<>();
        pointRate.put("BASIC", 1);
        pointRate.put("SILVER", 2);
        pointRate.put("GOLD", 3);

        HashMap<String, Integer> pointMap = new HashMap<>();
        for (int i = 0; i<records.length; i++) {
            String[] parts = records[i].split(" ");
            String user = parts[0];
            String level = parts[1];
            int pay = Integer.parseInt(parts[2]);
            int point = (int)(pointRate.get(level) * 0.01 * pay);
            // TODO: GetOrDefault로 keyValue 값 존재 여부에 대한 분기 제거 가능
            pointMap.put(user, pointMap.getOrDefault(user, 0) + point);
//            if (pointMap.containsKey(user)) {
//                int after = pointMap.get(user) + point;
//                pointMap.put(user, after);
//            } else {
//                pointMap.put(user, point);
//            }
        }
        int resultLength = pointMap.size();
        String[][] result = new String[resultLength][2];
        Set<String> keys = pointMap.keySet();
        List<String> keyList = new ArrayList<>(keys);
        Collections.sort(keyList);
        for (int i=0; i<resultLength; i++) {
            result[i][0] = keyList.get(i);
            result[i][1] = Integer.toString(pointMap.get(keyList.get(i)));
        }
        return result;
    }
}
