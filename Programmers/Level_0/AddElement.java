package Programmers.Level_0;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4 };
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181861