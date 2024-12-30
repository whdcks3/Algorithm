package Programmers.Level_0;

import java.util.Arrays;

public class CountUp {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        int[] arr = new int[end_num - start_num + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start_num++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
