package Programmers.Level_1;

public class Inner_product {
    public static void main(String[] args) {
        int answer = 0;
        int[] a = { 1, 2, 3, 4 };
        int[] b = { -3, -1, 0, 2 };

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/70128