package Programmers.Level_0;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String my_string = "hi12392";

        my_string = my_string.replaceAll("[a-z]", "");
        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120850