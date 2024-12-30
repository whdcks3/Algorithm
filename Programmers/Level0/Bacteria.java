package Programmers.Level0;

public class Bacteria {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        int answer = n;

        for (int i = 1; i <= t; i++) {
            answer *= n;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120910