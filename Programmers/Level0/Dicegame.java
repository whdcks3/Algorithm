package Programmers.Level0;

public class Dicegame {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int answer = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181839?language=java