package Programmers.Level_0;

public class Splicing {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = new int[] { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };
        String answer = "";

        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181915