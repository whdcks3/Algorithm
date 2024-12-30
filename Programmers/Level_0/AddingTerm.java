package Programmers.Level_0;

public class AddingTerm {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        int answer = 0;
        boolean[] included = { true, false, false, true, true };

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (i * d);
                continue;
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181931