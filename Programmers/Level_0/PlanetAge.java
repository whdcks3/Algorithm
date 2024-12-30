package Programmers.Level_0;

public class PlanetAge {
    public static void main(String[] args) {
        int age = 23;

        String answer = "";
        String temp = Integer.toString(age);
        for (int i = 0; i < temp.length(); i++) {
            answer += (char) ((char) temp.charAt(i) + 49);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120834