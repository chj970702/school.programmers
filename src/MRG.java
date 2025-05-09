import java.util.HashMap;
import java.util.Map;

// 가장 많이 받은 선물
public class MRG {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String, Integer>> giftCountMap = new HashMap<>();
        Map<String, Integer> jisooMap = new HashMap<>();
        // 선물 기록 map 초기화 해주고
        for (String from : friends) {
            giftCountMap.put(from, new HashMap<>());
            for (String to : friends) {
                if (!to.equals(from)) {
                    giftCountMap.get(from).put(to, 0);
                }
            }
        }
        // 누가 누구에게 선물 몇개줬는지 구함
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String from = parts[0];
            String to   = parts[1];
            Integer og = giftCountMap.get(from).get(to);
            giftCountMap.get(from).put(to, og + 1);
        }
        // 지수 구함
        for (String friend : friends) {
            jisooMap.put(friend, 0);
            for (String gift : gifts) {
                String[] parts = gift.split(" ");
                String from = parts[0];
                String to   = parts[1];
                if (friend.equals(from)) {
                    jisooMap.put(friend, jisooMap.get(friend) + 1);
                } else if (friend.equals(to)) {
                    jisooMap.put(friend, jisooMap.get(friend) -1);
                }
            }
        }
        // 받을 선물 갯수 구하기
        Map<String, Integer> willGetMap = new HashMap<>();
        for (String from : friends) {
            int willGet = 0;
            for (String to : friends) {
                if (!to.equals(from)) {
                    int giveCnt = giftCountMap.get(from).get(to);
                    int getCnt  = giftCountMap.get(to).get(from);
                    if (giveCnt != getCnt) {
                        if (giveCnt > getCnt) {
                            willGet += 1;
                        }
                    } else {
                        if (jisooMap.get(from) > jisooMap.get(to)) {
                            willGet += 1;
                        }
                    }
                }
            }
            willGetMap.put(from, willGet);

        }
        // 마지막 가장 많이 받는 갯수 구하기
        int largest = 0;
        for (String friend : friends) {
            int willGet = willGetMap.get(friend);
            if (willGet > largest) largest = willGet;
        }

        return largest;
    }

}
