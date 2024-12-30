package Programmers.Level_0;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] answer = new int[n / k];

        for (int i = 1; i <= n; i++) {
            if (n >= k * i) {
                answer[i - 1] += k * i;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181901