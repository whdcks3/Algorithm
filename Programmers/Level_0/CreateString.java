package Programmers.Level_0;

public class CreateString {
    public static void main(String[] args) {
        String[] my_string = { "progressive", "hamburger", "hammer", "ahocorasick" };
        int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };
        String answer = "";

        for (int i = 0; i < my_string.length; i++) {
            String str = my_string[i];
            answer += str.substring(parts[i][0], parts[i][1] + 1);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181911