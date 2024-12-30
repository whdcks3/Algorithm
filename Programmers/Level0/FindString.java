package Programmers.Level0;

public class FindString {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        int answer = 0;

        String new_str = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        if (new_str.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181864