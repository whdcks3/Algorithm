package Programmers.Level_1;

public class Add_m_p {
    public static void main(String[] args) {
        int[] absolutes = { 4, 7, 12 };
        boolean[] signs = { true, false, true };
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/76501