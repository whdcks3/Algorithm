package Programmers.Level1;

public class Colatz {
    public static void main(String[] args) {
        long n = 6;
        int answer = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                answer++;
            } else {
                n = n * 3 + 1;
                answer++;
            }
            if (answer > 500) {
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12943