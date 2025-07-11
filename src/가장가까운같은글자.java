public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            Character now = s.charAt(i);
            int result = -1;
            for (int j=0; j<i; j++) {
                Character comp = s.charAt(j);
                if (now.equals(comp)) {
                    result = i-j;
                }
            }
            answer[i] = result;
        }
        return answer;
    }

}
