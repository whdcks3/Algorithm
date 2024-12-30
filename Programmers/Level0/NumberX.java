package Programmers.Level0;

import java.util.Arrays;

public class NumberX {
    public static void main(String[] args) {
        String my_string = "oxooxoxxox";
        String[] arr = my_string.split("x", -1);
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(answer));
    }
}
