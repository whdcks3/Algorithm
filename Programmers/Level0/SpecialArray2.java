package Programmers.Level0;

import java.util.Arrays;

public class SpecialArray2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else
                    answer[i][j] = 0;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181833