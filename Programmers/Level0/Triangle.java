package Programmers.Level0;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] sides = new int[] { 199, 72, 222 };
        Arrays.sort(sides);
        int i = sides.length;
        System.out.println(Arrays.toString(sides));
        if (sides[i - 1] < (sides[i - 2] + sides[i - 3])) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120889
