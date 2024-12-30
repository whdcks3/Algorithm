package Programmers.Level1;

public class Wa_mel {
    public static void main(String[] args) {
        int n = 3;
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            }
            if (i % 2 == 1) {
                answer += "박";
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12922