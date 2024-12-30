package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class Sort_num {
    public static void main(String[] args) {
        long n = 118372;

        long answer = 0;
        String[] st = Long.toString(n).split("");
        Arrays.sort(st, Collections.reverseOrder());
        String str = "";

        for (String s : st) {
            str += s;
        }
        answer = Long.parseLong(str);

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java