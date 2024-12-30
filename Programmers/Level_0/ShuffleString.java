package Programmers.Level_0;

public class ShuffleString {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181942