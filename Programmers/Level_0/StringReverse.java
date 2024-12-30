package Programmers.Level_0;

public class StringReverse {
    public static void main(String[] args) {
        String my_string = "jaron";

        StringBuffer sb = new StringBuffer(my_string);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120822