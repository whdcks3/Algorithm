package Programmers.Level0;

public class Square {
    public static void main(String[] args) {
        int n = 976;
        int answer = 0;
        // IntStream.rangeClosed(1, n).filter(i->i*i==n).count();
        // 수정필요
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = 1;
            }
        }
        if (answer != 1) {
            answer = 2;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120909