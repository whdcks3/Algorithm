package Programmers.Level0;

import java.util.Arrays;

public class Countdown {
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num--;
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181899