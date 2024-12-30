import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 7, 10, 11 };
        Arrays.sort(array);
        int answer = array[array.length / 2];
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
