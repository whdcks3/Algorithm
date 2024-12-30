package Programmers.Level_0;

public class Dice2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
        int answer = 0;

        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181930