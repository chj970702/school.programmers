package LV2;

import java.util.EmptyStackException;
import java.util.Stack;

public class 올바른괄호 {
    public boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();
        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('(')) {
                stack.push(c);
            } else {
                try {
                    stack.pop();
                } catch (EmptyStackException e) {
                    answer = false;
                    break;
                }
            }
        }
        if (stack.size() != 0) answer = false;

        return answer;
    }
}
