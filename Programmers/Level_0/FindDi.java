package Programmers.Level_0;

import java.util.Arrays;

public class FindDi {
    public static void main(String[] args) {
        int n = 24;
        int[] divi = new int[10000];
        int count = 0;
        int i = 1;

        while (n >= i) {
            if (n % i == 0) {
                divi[count++] = i;
            }
            i = i + 1;
        }
        int[] answer = new int[count];

        for (int j = 0; j < count; j++) {
            answer[j] = divi[j];
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120897