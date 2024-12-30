package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class RemoveAd {
    public static void main(String[] args) {
        String[] strArr = { "and", "notad", "abcd" };
        List<String> answer = new ArrayList<>();

        for (String arr : strArr) {
            if (!arr.contains("ad")) {
                answer.add(arr);
            }
        }
        System.out.println(answer.toArray());
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181870