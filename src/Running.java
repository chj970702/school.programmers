import java.util.HashMap;
import java.util.Map;

public class Running {

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i=0; i< players.length; i++) {
            idxMap.put(players[i], i);
        }

        for (String call : callings) {
            int idx = idxMap.get(call);
            String front = players[idx-1];

            players[idx -1] = call;
            players[idx] = front;

            idxMap.put(call, idx-1);
            idxMap.put(front, idx);
        }
        return players;
    }
}
