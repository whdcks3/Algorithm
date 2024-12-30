package Programmers.Level1;

import java.util.Arrays;

public class Remove_smallest {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            answer[cnt++] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12935