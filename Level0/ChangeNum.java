import java.util.Arrays;

public class ChangeNum {
    public static void main(String[] args) {
        int[] num_list = { 2, 1, 6 };
        int n = 1;
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
