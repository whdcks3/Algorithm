package Programmers.Level_0;

import java.util.Arrays;

public class FromN {
    public static void main(String[] args) {
        int[] num_list = new int[] { 2, 1, 6 };
        int n = 3;
        int[] answer = new int[num_list.length - n + 1];
        // 인덱스값과 크기값은 다르기 때문에 +1을 해준다.

        for (int i = 0; i < num_list.length - n + 1; i++) {
            answer[i] = num_list[i + n - 1];
            // answer[i]는 인덱스값, num_list는 크기값을 인덱스로 바꿔줘야함
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181892
