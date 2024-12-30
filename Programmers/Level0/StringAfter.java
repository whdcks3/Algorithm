package Programmers.Level0;

public class StringAfter {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        String str = my_string.substring(my_string.length() - n);

        System.out.println(str);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181910