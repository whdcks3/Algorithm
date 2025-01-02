package Programmers.Level_1;

import java.util.Arrays;

public class Natural_number {
    public static void main(String[] args) {
        int n = 12345;
        String[] answer = String.valueOf(n).split("");
        String[] new_answer = new String[answer.length];
        int r = 0;

        for (int i = 4; i >= 0; i--) {
            new_answer[r++] = answer[i];
        }
        System.out.println(Arrays.toString(new_answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12932