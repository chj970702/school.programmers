package LV2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int binary = 0;
        int remove = 0;
        while (!s.equals("1")) {
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();
            remove += before - after;
            int length = s.length();
            s = Integer.toBinaryString(length);
            binary += 1;
        }
        answer[0] = binary;
        answer[1] = remove;
        return answer;
    }
}
