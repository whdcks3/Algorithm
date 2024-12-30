package Programmers.Level1;

public class Missing_num {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        System.out.println(45 - answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/86051