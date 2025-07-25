package LV1;

import java.util.Stack;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        /**
         * 1: 빵
         * 2: 야채
         * 3: 고기
         */
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int ing : ingredient) {
            stack.push(ing);
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size-4) == 1 &&
                    stack.get(size-3) == 2 &&
                    stack.get(size-2) == 3 &&
                    stack.get(size-1) == 1
                ) {
                    for (int i=0; i<4; i++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}
