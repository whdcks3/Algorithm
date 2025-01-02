package Programmers.Level_1;

import java.util.Arrays;

public class Number_x {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long num = x;
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12954