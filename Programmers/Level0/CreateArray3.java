package Programmers.Level0;

public class CreateArray3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] intervals = { { 1, 3 }, { 0, 4 } };

        int length = 0;
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            int[] arrIndex = intervals[i];
            length += arrIndex[1] - arrIndex[0] + 1;
        }

        int[] result = new int[length];

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j < intervals[i][1] + 1; j++) {
                result[count] = arr[j];
                count++;
            }
        }
        System.out.println(result);

    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181895