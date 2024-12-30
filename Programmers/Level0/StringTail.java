package Programmers.Level0;

public class StringTail {
    public static void main(String[] args) {
        String[] str_list = { "abc", "def", "ghi" };
        String ex = "ef";
        String answer = "";

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181841