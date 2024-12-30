package Programmers.Level_0;

public class DateCompare {
    public static void main(String[] args) {
        int answer = 0;
        int[] date1 = { 2021, 12, 28 };
        int[] date2 = { 2021, 12, 29 };

        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            } else if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}