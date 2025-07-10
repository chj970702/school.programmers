import java.util.*;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        // List로 변환
        List<String> card1List = new ArrayList<>();
        for (int i =0; i<cards1.length; i++) {
            card1List.add(cards1[i]);
        }
        List<String> card2List = new ArrayList<>();
        for (int i =0; i<cards2.length; i++) {
            card2List.add(cards2[i]);
        }
        List<Integer> card1Idx = new ArrayList<>();
        List<Integer> card2Idx = new ArrayList<>();

        for (int i=0; i<goal.length; i++) {
            if (card1List.contains(goal[i])) {
                int idx = card1List.indexOf(goal[i]);
                card1Idx.add(idx);
            }
            else if (card2List.contains(goal[i])) {
                int idx = card2List.indexOf(goal[i]);
                card2Idx.add(idx);
            }
        }
        // 만약에 두개의 사이즈 합친게 goal 사이즈 아니면 no
        if (card1Idx.size() + card2Idx.size() != goal.length) {
            answer = "No";
        }
        else if (isDuplicated(goal)) {
            answer = "No";
        }
        else if (isConsecutiveFromZero(card1Idx) && isConsecutiveFromZero(card2Idx) && isSorted(card1Idx) && isSorted(card2Idx)) {
            answer = "Yes";
        }
        else {
            answer = "No";
        }
        return answer;
    }
    private boolean isSorted(List<Integer> list) {
        for (int i=0; i<list.size() - 1; i++) {
            if (list.get(i) > list.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    private boolean isDuplicated(String[] arr) {
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            if (!set.add(s)) {
                return true;
            }
        }
        return false;
    }
    private boolean isConsecutiveFromZero(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != i) {
                return false; // 0부터 차례대로 1씩 증가하지 않으면 실패
            }
        }
        return true;
    }
}
