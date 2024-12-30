package Programmers.Level_0;

import java.util.Arrays;

public class DepArray {
    public static void main(String[] args) {
        int[] arr = { 49, 12, 100, 276, 33 };
        int[] answer = new int[arr.length];
        int n = 27;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181854