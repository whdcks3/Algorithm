package Programmers.Level_0;

public class EmphasisA {
    public static void main(String[] args) {
        String my_string = "abstract algebra";
        my_string = my_string.toLowerCase();
        String answer = my_string.replaceAll("a", "A");

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181874?language=java