package LV1;

public class 기사단원무기 {
    public int solution(int number, int limit, int power) {
        /** number: 기사단원 수
            limit: 공격력 제한
            power: 제한걸린 기사의 무기 공격력
         **/
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int gong = _getVal(i);
            if (gong > limit) {
                gong = power;
            }
            answer += gong;
        }

        return answer;
    }
    /** 그냥 약수 구하면 시간초과
     *  sqrt로 최적화
     **/
    private int _getVal(int num) {
        int sqrt = (int) Math.sqrt(num);
        int count = 0;
        for (int i=1; i<=sqrt; i++) {
            if (num % i == 0) { // 약수 중 작은 수
                count ++;
                if (num / i != i) { // 약수 중 큰 수
                    count ++;
                }
            }
        }
        return count;
    }
}
