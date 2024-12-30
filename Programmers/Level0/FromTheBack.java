package Programmers.Level0;

import java.util.Arrays;

public class FromTheBack {
    public static void main(String[] args) {
        int[] num_list = new int[] { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181852