import java.util.Arrays;

public class MultipleN {
    public static void main(String[] args) {
        int n = 3;
        int[] num_list = new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int j = 0;
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % n == 0) {
                count++;
            }
        }
        int[] answer = new int[count];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % n == 0) {
                answer[j] = num_list[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120905