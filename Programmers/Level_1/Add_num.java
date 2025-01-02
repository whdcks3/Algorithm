package Programmers.Level_1;

public class Add_num {
    public static void main(String[] args) {
        int N = 123;
        int answer = 0;
        String[] arr = String.valueOf(N).split("");

        for (String q : arr) {
            answer += Integer.parseInt(q);
        }

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java