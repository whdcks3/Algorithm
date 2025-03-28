package Programmers.Level_0;

public class SimpleEx {
    public static void main(String[] args) {
        String binomial = "43 + 12";

        int answer = 0;

        // 이항식을 공백을 기준으로 분리
        String[] parts = binomial.split(" ");

        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);

        // 연산자에 따라 계산 수행
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181865