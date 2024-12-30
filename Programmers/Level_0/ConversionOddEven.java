package Programmers.Level_0;

public class ConversionOddEven {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;
        if (n % 2 != 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i * i;
                }
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
