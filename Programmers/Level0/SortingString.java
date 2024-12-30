package Programmers.Level0;

import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String my_string = "Bcad";
        my_string = my_string.toLowerCase();
        String[] my_Strings = my_string.split("");
        String answer = "";
        Arrays.sort(my_Strings);
        for (int i = 0; i < my_Strings.length; i++) {
            answer += my_Strings[i];
        }
        System.out.println(answer);

    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120911