package Programmers.Level1;

public class Num_aver {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = (double) answer / arr.length;
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12944