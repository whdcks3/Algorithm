package Programmers.Level0;

import java.util.Arrays;

public class TailArray {
    public static void main(String[] args) {
        String my_string = "banana";
        String[] arr = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181909