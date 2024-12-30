package Programmers.Level0;

import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        String direction = "right";
        int[] answer = new int[numbers.length];

        if (direction.equals("left")) {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        } else if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120844