package Programmers.Level_0;

public class BasedLength {
    public static void main(String[] args) {
        // int[] num_list = new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list = new int[] { 2, 3, 4, 5 };
        int answer = 0;
        int first = 1;

        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            for (int i = 0; i < num_list.length; i++) {
                first *= num_list[i];
                answer = first;
            }
        }
        System.out.println(answer);
    }
}
