package Programmers.Level_0;

public class CompareTwonum {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        String ab = String.valueOf(a) + String.valueOf(b);
        int newab = Integer.parseInt(ab);
        int answer = 0;

        if (newab < (2 * a * b)) {
            answer = 2 * a * b;
        } else {
            answer = newab;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181938