package Programmers.Level0;

public class DupliChar {
    public static void main(String[] args) {
        String my_string = "people";
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120888