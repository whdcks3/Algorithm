package Programmers.Level0;

public class DiceNum {
    public static void main(String[] args) {
        int[] box = { 1, 1, 1 };
        int n = 1;
        int answer = 0;

        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        answer = a * b * c;
        System.out.println(answer);
    }
}
