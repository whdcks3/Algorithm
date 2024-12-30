package Programmers.Level0;

public class ManiNum {
    public static void main(String[] args) {
        int[] numLog = { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 };
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            if ((numLog[i] - numLog[i - 1] == 1)) {
                answer += "w";
            } else if (numLog[i] - numLog[i - 1] == -1) {
                answer += "s";
            } else if (numLog[i] - numLog[i - 1] == 10) {
                answer += "d";
            } else if (numLog[i] - numLog[i - 1] == -10) {
                answer += "a";
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181925