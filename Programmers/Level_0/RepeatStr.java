package Programmers.Level_0;

public class RepeatStr {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i].repeat(n);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120825