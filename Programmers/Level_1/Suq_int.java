package Programmers.Level_1;

public class Suq_int {
    public static void main(String[] args) {
        int n = 121;
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            System.out.println((long) Math.pow(Math.sqrt(n) + 1, 2));
        } else {
            System.out.println(-1);
        }
    }
}
