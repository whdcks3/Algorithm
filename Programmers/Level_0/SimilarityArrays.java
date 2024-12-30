package Programmers.Level_0;

public class SimilarityArrays {
    public static void main(String[] args) {
        String[] s1 = new String[] { "a", "b", "c" };
        String[] s2 = new String[] { "com", "b", "d", "p", "c" };
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120903
