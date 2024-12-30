import java.util.Arrays;

public class LastTwo {
    public static void main(String[] args) {
        int[] num_list = new int[] { 5, 2, 1, 7, 5 };
        int[] answer = new int[num_list.length + 1];
        int last = 0;

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            last = num_list[num_list.length - 1] * 2;
        }
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[num_list.length] = last;
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181927