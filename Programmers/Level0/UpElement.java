package Programmers.Level0;

import java.util.Arrays;

public class UpElement {
    public static void main(String[] args) {
        int[] num_list = new int[] { 2, 1, 6 };
        int n = 1;

        int answer[] = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181889