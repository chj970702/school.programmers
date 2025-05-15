import java.util.*;

public class 모의문제3 {
    public String[][] solution(String[] logs) {
        Map<String, Map<String, Integer>> map = new HashMap<>();
        for (int i=0; i<logs.length; i++) {
            String[] parts = logs[i].split(" ");
            String user = parts[0];
            String product = parts[1];
            if (map.get(user) == null) {
                map.put(user, new HashMap<>());
            }
            Map<String, Integer> valueMap = new HashMap<>();
            // 해당 사용자가 해당 상품을 산 경험이 있으면
            if (map.get(user).containsKey(product)) {
                int before = map.get(user).get(product);
                Map<String, Integer> beforeValueMap = map.get(user);
                beforeValueMap.put(product, before + 1);
            }
            // 해당 사용자가 상품을 산 경험이 없으면
            else {
                Map<String, Integer> beforeValueMap = map.get(user);
                beforeValueMap.put(product, 1);
            }
        }
        List<String[]> result = new ArrayList<>();
        List<String> users = new ArrayList<>(map.keySet());
        Collections.sort(users);

        for (String user : users) {
            Map<String, Integer> valueMap = map.get(user);

            List<String> products = new ArrayList<>(valueMap.keySet());
            Collections.sort(products);

            for (String product : products) {
                int count = valueMap.get(product);
                result.add(new String[]{user, product, String.valueOf(count)});
            }
        }
        String[][] answer = result.toArray(new String[0][0]);
        return answer;
    }
}
