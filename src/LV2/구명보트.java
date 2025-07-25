package LV2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int left = 0;                 // 가장 가벼운 사람 포인터
        int right = people.length - 1; // 가장 무거운 사람 포인터

        while (left <= right) {
            // 가장 무거운 사람 + 가장 가벼운 사람을 태울 수 있으면 같이 태움
            if (people[left] + people[right] <= limit) {
                left++; // 가벼운 사람 태움
            }
            // 무거운 사람은 항상 태워야 하므로 무조건 보트 하나 소모
            right--; // 무거운 사람 태움
            answer++; // 보트 1대 사용
        }
        return answer;
    }
}
