import java.util.Arrays;

public class BigNum {
    public static void main(String[] args) {
        int[] array = { 1, 8, 3 };
        int[] answer = { 0, 0 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120899