package Programmers.Level_0;

public class AntArmys {
    public static void main(String[] args) {
        int hp = 23;
        int count = 0;

        count += hp / 5;
        hp %= 5;

        count += hp / 3;
        hp %= 3;

        count += hp / 1;

        System.out.println(count);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120837