package Programmers.Level_1;

public class Stringp_y {
    public static void main(String[] args) {
        String s = "pyy";
        s = s.toLowerCase();
        int count_p = 0;
        int count_y = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p')
                count_p++;
            if (ch == 'y')
                count_y++;
        }
        if (count_p == count_y) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12916