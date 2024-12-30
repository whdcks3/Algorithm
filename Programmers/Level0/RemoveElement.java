package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = { 293, 1000, 395, 678, 94 };
        int[] delete_list = { 94, 777, 104, 1000, 1, 12 };

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181844
