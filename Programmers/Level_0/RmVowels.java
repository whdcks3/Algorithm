package Programmers.Level_0;

public class RmVowels {
    public static void main(String[] args) {
        // a,i,o,u,e
        String my_string = "bus";
        String[] answer = new String[] { "a", "i", "o", "u", "e" };
        for (String a : answer) {
            my_string = my_string.replaceAll(a, "");
        }
        System.out.println(my_string);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120849