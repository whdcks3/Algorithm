package Programmers.Level_0;

import java.util.ArrayList;
import java.util.List;

public class Todolist {
    public static void main(String[] args) {
        String[] todolist = { "problemsolving", "practiceguitar", "swim", "studygraph" };
        boolean[] finished = { true, false, true, false };

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todolist.length; i++) {
            if (finished[i] == false) {
                answer.add(todolist[i]);
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181885