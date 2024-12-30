import java.util.Arrays;

public class FromTheBack2 {
    public static void main(String[] args) {
        int[] num_list = new int[] { 12, 4, 15, 46, 38, 1, 14 };
        int[] answer = new int[5];

        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181853