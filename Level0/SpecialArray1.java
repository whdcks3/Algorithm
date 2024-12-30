public class SpecialArray1 {
    public static void main(String[] args) {
        int[][] arr = { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println(0);
                }
            }
        }
        System.out.println(1);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181831