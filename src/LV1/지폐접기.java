package LV1;

class 지폐접기 {
    public static void main(String[] args) {
        지폐접기 sol = new 지폐접기();

        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        int result = sol.solution(wallet, bill);
        System.out.println("결과: " + result);
    }

    public int solution(int[] wallet, int[] bill) {
        int answer = 0; // 지폐를 접은 횟수
        while (Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1]) || Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            answer += 1;
        }
        return answer;  //
    }

}