package LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PCCP 기출문제 1번 붕대감기
public class BDGG {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;

        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        Map<Integer, Integer> attackMap = new HashMap<>();

        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
        }

        int wholeTime  = attacks[attacks.length - 1][0];
        int maxHealth  = health; // 최대체력
        int successCnt = 0;      // 연속성공
        for (int i=1; i<=wholeTime; i++) {
            // 공격이 왔을때
            if (attackMap.containsKey(i)) {
                health -= attackMap.get(i);
                if (health <= 0) break;
                successCnt = 0;
            }
            // 공격이 없을땐 피회복
            else {
                // 최대 체력이 아닐때만 회복
                if (health != maxHealth) {
                    health = health + x > maxHealth ? maxHealth : health + x;
                }
                successCnt += 1;
                // 연속성공이 t회인 경우
                if (successCnt == t) {
                    health = health + y > maxHealth ? maxHealth : health + y;
                    successCnt = 0;
                }
            }
        }
        if (health <= 0) return -1;
        else return health;
    }
}
